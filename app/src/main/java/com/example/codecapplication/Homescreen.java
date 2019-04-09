package com.example.codecapplication;

import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Homescreen extends AppCompatActivity {
    Button mButtonNFC = findViewById(R.id.button_nfc);
    Button mButtonServer = findViewById(R.id.button_ServerConnect);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        mButtonNFC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                NfcAdapter nfcAdapter = NfcAdapter.getDefaultAdapter(Homescreen.this);
                if (nfcAdapter!=null && nfcAdapter.isEnabled()){
                    Toast.makeText(Homescreen.this, "NFC Available", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Homescreen.this, "NFC Not Available", Toast.LENGTH_SHORT).show();
                }

            }
        });

        mButtonServer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });


    }
}
