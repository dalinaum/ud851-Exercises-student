package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Ryu on 2017-01-03.
 */

public class ChildActivity extends AppCompatActivity{
    private TextView mdisplay;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mdisplay = (TextView) findViewById(R.id.tv_display);

    }
}
