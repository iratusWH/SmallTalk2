package com.mpei.smalltalk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    protected String userLogin;
    protected String userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        Button button = (Button) findViewById(R.id.buttonAuth);
        button.setOnClickListener(this);
    }


    public void onSignUpClick(View view){
        Toast.makeText(this, "Регистрация", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Вход", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, ChatsList.class);
        startActivity(intent);
    }
/*
    @Override
    protected void onUserLeaveHint() {
        Toast toast = Toast.makeText(getApplicationContext(), "Нажата кнопка HOME", Toast.LENGTH_SHORT);
        toast.show();
        super.onUserLeaveHint();
    }

 */
}