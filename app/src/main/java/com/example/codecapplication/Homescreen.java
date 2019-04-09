package com.example.codecapplication;

<<<<<<< HEAD
import android.nfc.cardemulation.HostApduService;
=======
import android.nfc.NfcAdapter;
>>>>>>> 64e266127307f5959ef15e165d501628c96109a8
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
