package com.example.codecapplication;

import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Homescreen extends AppCompatActivity {
    Button mButtonNFC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        mButtonNFC = findViewById(R.id.button_NFC);

        mButtonNFC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });


    }
}

public class MyHostApduService extends HostApduService {
    @Override
    public byte[] processCommandApdu(byte[] apdu, Bundle extras) {
       ...
    }
    @Override
    public void onDeactivated(int reason) {
       ...
    }
}
