package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Jusung on 2017. 1. 4..
 */

public class ChildActivity extends AppCompatActivity{

    TextView tv_display;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        tv_display=(TextView)findViewById(R.id.tv_display);
    }
}
