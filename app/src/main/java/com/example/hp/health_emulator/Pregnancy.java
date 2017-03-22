package com.example.hp.health_emulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pregnancy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregnancy);
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ex = (EditText) findViewById(R.id.editText);
                int s = Integer.parseInt(ex.getText().toString());
                if(s == 1){
                    Intent myIntent = new Intent(v.getContext(), Pregnancy_1.class);
                    startActivityForResult(myIntent, 0);
                }

                else if(s == 2){
                    Intent myIntent = new Intent(v.getContext(), Pregnancy_2.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });

    }
}
