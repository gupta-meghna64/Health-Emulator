package com.example.hp.health_emulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sleep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sleep);
        Button b=(Button) findViewById(R.id.sleep_calculate);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText sl=(EditText) findViewById(R.id.sleep);
                EditText u=(EditText) findViewById(R.id.up);
                TextView t=(TextView) findViewById(R.id.sleep_answer);
                int sleep=Integer.parseInt(sl.getText().toString());
                int wake=Integer.parseInt(u.getText().toString());
                float answer;
                if(sleep>=1600 && sleep<=2300)
                {
                    if(wake<=0300)
                        answer=0300-wake;
                    else
                        answer=0400;
                }
                else if(sleep>=0000 && sleep<=0300)
                {
                    answer=0300-sleep;
                }
                else
                    answer=0;
                answer=(answer/100)*60;
                answer=answer/240;
                if(answer>=0.75)
                    t.setText("Good");
                else if(answer>=50 && answer <=75)
                    t.setText("Poor");
                else
                    t.setText("Poor");

            }
        });
    }
}
