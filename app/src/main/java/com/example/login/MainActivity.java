package com.example.login;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText usuario1;
    EditText contra1;
    Button sesion;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario1 = findViewById(R.id.usuario);
        contra1 = findViewById(R.id.contra);
        sesion = findViewById(R.id.sesion);

        sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombreUsuario;
                String contraUsuario;
                nombreUsuario = usuario1.getText().toString();
                contraUsuario = contra1.getText().toString();
                if ((nombreUsuario.equals("admin123")) && (contraUsuario.equals("contra123"))) {
                    Intent intent = new Intent(MainActivity.this, Pantalla_2.class);
                    startActivity(intent);

                }

                else {
                    Toast.makeText(MainActivity.this, "Error de Login", Toast.LENGTH_LONG).show();

                }

            }

        });


        }


}


