package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by kinwha on 2017-01-04.
 */

public class ChildActivity extends AppCompatActivity{
    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        mDisplayText = (TextView)findViewById(R.id.tv_display)
    }
}
