package com.example.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sintomas extends AppCompatActivity {

    private Button b1;
    private Button b2;
    private Button b3;
    private TextView txtdataatulizada;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas);


        b1 = findViewById(R.id.ProximosSintomas);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sintomas.this , cuidados.class);
                startActivity(intent);
            }
        });


        b2 = findViewById(R.id.AnteriorSintomas);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sintomas.this, MainActivity.class);
                startActivity(intent);
            }
        });

        b3 = findViewById(R.id.MenuGeralSintomas);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sintomas.this , MenuGeral.class);
                startActivity(intent);
            }
        });

        // Metuodo Dt Atualizada
        Date dataatualizada = new Date();
        String Data = new SimpleDateFormat("dd/MM/yyyy").format(dataatualizada);
        txtdataatulizada = findViewById(R.id.dataatualizadasintomas);
        txtdataatulizada.setText(Data);


    }
}
