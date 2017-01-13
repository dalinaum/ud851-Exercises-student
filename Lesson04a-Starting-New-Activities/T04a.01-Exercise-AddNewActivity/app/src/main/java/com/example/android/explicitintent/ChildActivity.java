package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by tong-ilsong on 2017. 1. 5..
 */

public class ChildActivity extends AppCompatActivity {

    private TextView mDisplay;

    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mDisplay=(TextView)findViewById(R.id.tv_display);
    }
}
