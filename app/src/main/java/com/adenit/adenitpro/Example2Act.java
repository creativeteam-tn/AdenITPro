package com.adenit.adenitpro;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class Example2Act extends AppCompatActivity {

    RelativeLayout screen;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example2);

        screen=(RelativeLayout)findViewById(R.id.screen);
        rg=(RadioGroup)findViewById(R.id.rg);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rdoRed)
                    screen.setBackgroundColor(Color.RED);
                if(checkedId==R.id.rdoGreen)
                    screen.setBackgroundColor(Color.GREEN);
                if(checkedId==R.id.rdoBlue)
                    screen.setBackgroundColor(Color.BLUE);
            }
        });
    }
}

