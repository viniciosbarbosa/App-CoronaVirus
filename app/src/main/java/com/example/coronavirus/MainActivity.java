package com.example.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    private Button B1;
    private Button B2;
    private Button B3;
    private TextView txtdateatualizada;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        B1 = findViewById(R.id.ProximoHome);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sintomas.class);
                startActivity(intent);
            }
        });

        B2 = findViewById(R.id.AnteriorHome);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , cuidados.class );
                startActivity(intent);
            }
        });

        B3 = findViewById(R.id.MenuGeralSintomas);
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , MenuGeral.class);
                startActivity(intent);
            }
        });


        // Metuodo DT Atualizada
        Date dataatualizada = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataatualizada);
        txtdateatualizada = findViewById(R.id.dataatualizadamain);
        txtdateatualizada.setText(data);



    }
}
