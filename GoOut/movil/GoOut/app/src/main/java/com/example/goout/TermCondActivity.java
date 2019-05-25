package com.example.goout;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TermCondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_cond);

        Button BtnAceptarTyC = (Button)findViewById(R.id.btnAceptarTyC);

        BtnAceptarTyC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),InicioActivity.class);
                startActivityForResult(intent,0);
            }
        });
    }
}
