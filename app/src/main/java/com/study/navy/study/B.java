package com.study.navy.study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        A a = (A)getApplicationContext();
        String s = a.s;
        s=a.getString("other");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
