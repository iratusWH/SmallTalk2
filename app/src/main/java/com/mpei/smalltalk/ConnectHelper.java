/*package com.mpei.smalltalk;

import android.os.AsyncTask;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectHelper extends AsyncTask<String, String, String> {

    @Override
    protected String doInBackground(String[] objects) {
        try{
            String url = "jdbc:mysql://localhost/store";
            String username = "root";
            String password = "password";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){

                System.out.println("Connection to Store DB successful!");
            }
        }
        catch(Exception ex){
            System.out.println();

            System.out.println(ex);
        }
        return ;
    }
}*/
