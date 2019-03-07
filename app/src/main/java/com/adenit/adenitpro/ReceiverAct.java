package com.adenit.adenitpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiverAct extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        tv=(TextView)findViewById(R.id.tvWelcome);
        Intent i = getIntent();
        tv.setText("Welcome: "+ i.getStringExtra("name"));
    }
}
