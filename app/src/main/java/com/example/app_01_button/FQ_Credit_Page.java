package com.example.app_01_button;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FQ_Credit_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fq__credit__page);

        Button redeemBtn = findViewById(R.id.redeemBtn);

        redeemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redeemIntend = new Intent(getApplicationContext(), FQ_Credit_Redeem.class);
                startActivity(redeemIntend);
            }
        });
    }
}
