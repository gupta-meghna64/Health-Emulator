package com.example.hp.health_emulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calorie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calorie);
        Button b=(Button) findViewById(R.id.calculate);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                EditText a=(EditText) findViewById(R.id.hours);
                TextView c=(TextView) findViewById(R.id.answer);
                String data=a.getText().toString();
                double answer=7.5*50*Float.parseFloat(data);
                c.setText(String.valueOf(answer).concat(" calories burnt."));
            }
        });
    }
}
