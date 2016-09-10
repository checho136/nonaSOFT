package com.app.nonasoft.grupo2_desarrollodesoftware;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnComenzar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //le seteo a el boton comenzar el id
        btnComenzar = (Button) findViewById(R.id.iniciarBtn);

        btnComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnComenzar = new Intent(MainActivity.this, IndexViewActivity.class);
                startActivity(btnComenzar);
            }
        });
    }




}
