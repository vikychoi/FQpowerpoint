package com.example.app_01_button;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;



public class showResult extends AppCompatActivity {


    boolean clicked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);


        final Button queueButton = findViewById(R.id.queueButton);
        final TextView info = findViewById(R.id.info);
        Button homeButton = findViewById(R.id.homeButton);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if(clicked){
                    intent = new Intent(getApplicationContext(), queuedHome.class);
                }
                else{
                    intent = new Intent(getApplicationContext(), MainActivity.class);
                }
                startActivity(intent);
            }
        });

        queueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(showResult.this);

                builder.setCancelable(true);
                builder.setTitle("Queue Resut");
                builder.setMessage("Queue Successful!\nYour queue number is\n62");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                info.setText("Current queue:46 (62) \nYour queue: 62  \nEstimated wait time: <10 minutes");
                queueButton.setText("Dequeue");
                builder.show();
                clicked = true;
            }
        });

    }
}
