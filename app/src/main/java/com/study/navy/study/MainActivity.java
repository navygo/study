package com.study.navy.study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A a = (A)getApplicationContext();
        String s = a.s;
        s = a.getString("ok is good idea");
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}
