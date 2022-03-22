package com.example.a1app_hh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class teladois extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teladois);
        Intent ita = getIntent();
        String msg=ita.getStringExtra(MainActivity.TELA);
        EditText txt = (EditText) findViewById(R.id.editTextTextPersonName2);
    }
}

