package com.example.restapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.restapp.databinding.ActivityMainBinding;

import java.util.Arrays;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Butoon mButoon;
    private final List<String> mensajes = Arrays.asList(
            "Edad",
            "sexo",
            "nacimiento",
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       mTextView = findViewById(R.id.mensajeTextview);
        mButoon = findViewById(R.id.aceptarButton);

    }
}