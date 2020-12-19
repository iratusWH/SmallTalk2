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

    protected String url = "jdbc:postgresql://localhost:5432/Messanger";
    protected String username = "root";
    protected String password = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        Button button = (Button) findViewById(R.id.buttonAuth);
        button.setOnClickListener(this);
        ConnectHelper connect = new ConnectHelper();
        Toast.makeText(this,connect.doInBackground(new String[]{url, username, password}), Toast.LENGTH_LONG).show();
    }


    public void onSignUpClick(View view){
        //connectHelper firstConnect = new connectHelper();
        Toast.makeText(this, "Регистрация" /*firstConnect.dataBaseOutput()*/, Toast.LENGTH_SHORT).show();
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