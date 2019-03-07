package com.adenit.adenitpro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SenderActivity extends AppCompatActivity {

    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        et= (EditText)findViewById(R.id.etName);
    }

    public void goToAct(View view) {
        Intent i= new Intent(SenderActivity.this, ReceiverAct.class);
        i.putExtra("name",et.getText().toString());
        startActivity(i);
    }

    public void openGoogle(View view) {
        Uri u= Uri.parse("http://www.google.com");
        Intent i= new Intent(Intent.ACTION_VIEW, u);
        startActivity(i);
    }
}
