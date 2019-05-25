package com.example.goout;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCrearCuenta = (Button)findViewById(R.id.BtnCrearCuenta);
        Button btnIniciarSesion = (Button)findViewById(R.id.BtnIniSesion);

        btnCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),CrearCuentaActivity.class);
                startActivityForResult(intent,0);
            }
        });

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),IniciarSesionActivity.class);
                startActivityForResult(intent,0);
            }
        });
    }
}
