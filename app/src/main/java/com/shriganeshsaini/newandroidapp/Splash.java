package com.shriganeshsaini.newandroidapp;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        makeText(this, "onCreate", LENGTH_SHORT).show();
        Thread thread = new Thread(){
            public void run() {
                try{
                    sleep(4000);
                } catch(Exception e) {
                    e.printStackTrace();

                }
                finally{
                    Intent intent = new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);

                }
            }
        };thread.start();

    }


    protected void onResume(){
        super.onResume();
        Toast toast= Toast.makeText(this, "onResume", LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
    protected void onPause(){
        super.onPause();
        Toast toast=Toast.makeText(this, "onPause", LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }
    protected void onStop(){
        super.onStop();

        Toast toast = Toast.makeText(this, "onStop", LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
    protected void onRestart(){
        super.onRestart();

        Toast toast = Toast.makeText(this, "onRestart", LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);


    }
    protected void onDestroy(){
        super.onDestroy();
        Toast toast = Toast.makeText(this, "onDestroy", LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }

    
    
}