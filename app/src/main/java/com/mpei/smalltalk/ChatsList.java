package com.mpei.smalltalk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChatsList extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickUserSettings(View view) {
        Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ChatsList.this, UserSettings.class);
        startActivity(intent);
    }

    public void onClickAddChat(View v) {
        Toast.makeText(this, "Добавление Чата", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ChatsList.this, AddChat.class);
        startActivity(intent);
    }

    public void onClickChatActivity(View v) {
        Toast.makeText(this, "Чат", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ChatsList.this, ChatActivity.class);
        startActivity(intent);
    }
}
