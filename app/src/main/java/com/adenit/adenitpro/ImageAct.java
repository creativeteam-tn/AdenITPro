package com.adenit.adenitpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageAct extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        iv=findViewById(R.id.imageView);
    }

    public void changeImage(View view) {
        iv.setImageResource(R.drawable.fr2);
    }
}


