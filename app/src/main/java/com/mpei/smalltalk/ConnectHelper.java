package com.mpei.smalltalk;

import android.os.AsyncTask;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectHelper extends AsyncTask<String, String, String> {

    @Override
    protected String doInBackground(String[] objects) {
        try{
            try (Connection conn = DriverManager.getConnection(objects[0], objects[1], objects[2])){ //url, user,password

                return "Connection to Store DB successful!";
            }
        }
        catch(Exception ex){
            System.out.println(ex);
            return "Error";
        }
    }
}
