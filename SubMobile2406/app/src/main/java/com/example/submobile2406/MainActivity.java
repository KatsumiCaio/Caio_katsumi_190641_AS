package com.example.submobile2406;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //linkando o o Botão para que ele funcione
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            // parte para o Snackbar aparecer ao clicar no FloatingActionButton
            public void onClick(View view) {
                Snackbar.make(view, "Funcionou!!!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


}
