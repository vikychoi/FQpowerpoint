package com.example.app_01_button;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static boolean clicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        Button dequeueButton = findViewById(R.id.dequeue);
        Button redeem = findViewById(R.id.redeem);

        redeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FQ_Credit_Page.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity2();

            }
        });
        dequeueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dequeue();

            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(this, DisplaySearch.class);
        startActivity(intent);
    }

    public void dequeue(){

    }
}
