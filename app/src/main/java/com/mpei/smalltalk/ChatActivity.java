package com.mpei.smalltalk;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {
    RecyclerView messagesRecycler;
    //protected ArrayList<String, String, Time, Date> messages = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_page);
    }
}
