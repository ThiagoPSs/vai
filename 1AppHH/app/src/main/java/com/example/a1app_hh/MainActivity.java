package com.example.a1app_hh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String TELA="com.example.a1app_hh.Activity_main2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviarmsg ( View view)
    {
        Intent it=new Intent(this,teladois.class);
        EditText txt = (EditText) findViewById(R.id.editTextTextPersonName);
        String msg = txt.getText().toString();
        it.putExtra (TELA,msg);
    }

}




