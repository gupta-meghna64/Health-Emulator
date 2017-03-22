package com.example.hp.health_emulator;

/**
 * Created by HP on 11-02-2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DietActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet_activity);

        Button dietplan_but = (Button) findViewById(R.id.button5);
        Button recipe_but = (Button) findViewById(R.id.button6);

        dietplan_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), DietPlaner.class);
                startActivityForResult(myIntent, 0);
            }
        });

        recipe_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), HealthyRecipes.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
