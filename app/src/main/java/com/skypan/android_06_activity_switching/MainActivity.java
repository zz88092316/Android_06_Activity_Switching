package com.skypan.android_06_activity_switching;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout AColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AColor = (ConstraintLayout) findViewById(R.id.acolor);
    }

    public void Switch(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);
        AColor.setBackgroundColor(Color.YELLOW);
        startActivity(intent);
    }
}