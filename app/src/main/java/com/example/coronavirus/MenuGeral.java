package com.example.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuGeral extends AppCompatActivity {

    private ImageView b1;
    private ImageView b2;
    private ImageView b3;
    private TextView txtdev;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menugeral);


        b1 = findViewById(R.id.imghome);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuGeral.this , MainActivity.class);
                startActivity(intent);
            }
        });

        b2 = findViewById(R.id.imgsintomas);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuGeral.this , Sintomas.class);
                startActivity(intent);
            }
        });

        b3 = findViewById(R.id.imgcuidados);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuGeral.this , cuidados.class);
                startActivity(intent);
            }
        });

        txtdev = findViewById(R.id.creditodev);
        txtdev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuGeral.this,Creditos.class);
                startActivity(intent);
            }
        });



    }
}
