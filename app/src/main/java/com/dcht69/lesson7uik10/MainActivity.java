package com.dcht69.lesson7uik10;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.iv_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView img = (ImageView) view;
                img.setImageLevel(img.getDrawable().getLevel() == 0 ? 1 : 0);
            }
        });
        ImageView ivPin = findViewById(R.id.iv_pin);
        AnimationDrawable drawable = (AnimationDrawable) ivPin.getDrawable();
        drawable.start();
    }
}