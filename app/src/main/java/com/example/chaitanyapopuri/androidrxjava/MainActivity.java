package com.example.chaitanyapopuri.androidrxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    Button button;

    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      editText= (EditText) findViewById(R.id.edit);
    }
}
