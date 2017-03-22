package com.example.hp.health_emulator;

import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

public class EmergencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_activity);
        Button smsbhejo=(Button) findViewById(R.id.emergencybutton);
        smsbhejo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        String sms="Help required.";
        String number="9643508726";

        SmsManager message= SmsManager.getDefault();
        message.sendTextMessage(number,null,sms,null,null);

        }
        });
        }
        }
