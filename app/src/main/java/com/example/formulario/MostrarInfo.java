package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MostrarInfo extends AppCompatActivity {

    TextView tvnombre, tvprofesion, tvedad, tvcorreo;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_info);

        tvnombre = (TextView)findViewById(R.id.tvNombre);
        tvprofesion = (TextView)findViewById(R.id.tvProfesion);
        tvedad = (TextView)findViewById(R.id.tvEdad);
        tvcorreo = (TextView)findViewById(R.id.tvCorreo);
        btnOk = (Button)findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MostrarInfo.this, MainActivity.class);
                startActivity(intent);
            }
        });


        mostrarInfo();
    }

    private void mostrarInfo() {

        Bundle info = this.getIntent().getExtras();
        String nombre = info.getString("name");
        String profesion = info.getString("profesion");
        String edad = info.getString("age");
        String correo = info.getString("email");

        tvnombre.setText(nombre);
        tvprofesion.setText(profesion);
        tvedad.setText(edad);
        tvcorreo.setText(correo);

    }
}