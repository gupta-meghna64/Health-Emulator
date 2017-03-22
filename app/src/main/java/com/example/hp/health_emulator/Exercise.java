package com.example.hp.health_emulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by HP on 11-02-2017.
 */

public class Exercise extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise);
        Button yoga = (Button) findViewById(R.id.button7);
        Button sleep = (Button) findViewById(R.id.button10);
        Button meditation = (Button) findViewById(R.id.button9);
        Button calorie = (Button) findViewById(R.id.button8);
        yoga.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent myIntent = new Intent(v.getContext(), Yoga.class);
                                        startActivityForResult(myIntent, 0);

                                    }
                                }
        );
        sleep.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent myIntent = new Intent(v.getContext(), Sleep.class);
                                        startActivityForResult(myIntent, 0);

                                    }
                                }
        );
        calorie.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent myIntent = new Intent(v.getContext(), Calorie.class);
                                         startActivityForResult(myIntent, 0);

                                     }
                                 }
        );
        meditation.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent myIntent = new Intent(v.getContext(), Meditation.class);
                                         startActivityForResult(myIntent, 0);

                                     }
                                 }
        );


    }
}


