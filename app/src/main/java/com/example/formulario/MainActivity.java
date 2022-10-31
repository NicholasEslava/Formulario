package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, profesion, edad, correo;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.editNombre);
        profesion = (EditText)findViewById(R.id.editApellidos);
        edad = (EditText)findViewById(R.id.editEdad);
        correo = (EditText)findViewById(R.id.editCorreo);
        aceptar = (Button)findViewById(R.id.btnAceptar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nombre.getText().toString();
                String profe = profesion.getText().toString();
                String age = edad .getText().toString();
                String email = correo.getText().toString();
                Intent i = new Intent(MainActivity.this, MostrarInfo.class);

                i.putExtra("name", name);
                i.putExtra("profesion", profe);
                i.putExtra("age", age);
                i.putExtra("email", email);

                startActivity(i);
            }
        });
    }
}