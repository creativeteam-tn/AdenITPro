package com.adenit.adenitpro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);
    }

    public void goToAct(View view) {
        Intent i= new Intent(SenderActivity.this, ReceiverAct.class);
        startActivity(i);
    }

    public void openGoogle(View view) {
        Uri u= Uri.parse("http://www.google.com");
        Intent i= new Intent(Intent.ACTION_VIEW, u);
        startActivity(i);
    }
}
