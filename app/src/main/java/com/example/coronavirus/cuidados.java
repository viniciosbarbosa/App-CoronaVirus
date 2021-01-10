package com.example.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class cuidados extends AppCompatActivity {

    private Button b1;
    private Button b2;
    private Button b3;
    private TextView txtdate;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuidados);


        b1 = findViewById(R.id.MenuGeralSintomas);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cuidados.this , MenuGeral.class);
                startActivity(intent);
            }
        });

        b2 = findViewById(R.id.ProximosSintomas);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cuidados.this ,MainActivity.class);
                startActivity(intent);
            }
        });

        b3 = findViewById(R.id.AnteriorSintomas);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cuidados.this , Sintomas.class);
                startActivity(intent);
            }
        });


        // Metuodo DT Atualizada
        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        txtdate = findViewById(R.id.dataatualizadacuidados);
        txtdate.setText(data);




    }




}
