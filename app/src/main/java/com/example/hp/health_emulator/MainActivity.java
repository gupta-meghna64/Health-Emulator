package com.example.hp.health_emulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button diet = (Button) findViewById(R.id.button1);
        Button exercise_butt = (Button) findViewById(R.id.button3);
        Button emergen_butt = (Button) findViewById(R.id.button2);
        Button women_rel = (Button) findViewById(R.id.button4);

        diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), DietActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

        exercise_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Exercise.class);
                startActivityForResult(myIntent, 0);

            }
        });

        emergen_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), EmergencyActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
        women_rel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(v.getContext(), Pregnancy.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}
