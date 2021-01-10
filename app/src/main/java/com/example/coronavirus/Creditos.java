package com.example.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Creditos extends AppCompatActivity {

    private ImageView gmail;
    private ImageView linkedin;
    private ImageView whatapp;
    private ImageView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        voltar =findViewById(R.id.voltarmenu);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Creditos.this , MenuGeral.class);
                startActivity(intent);
            }
        });


        gmail = findViewById(R.id.gmail);
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatoemail(gmail);
            }
        });

        linkedin = findViewById(R.id.linkedin);
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.linkedin.com/in/viniciosbarbosaa/");

                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        whatapp = findViewById(R.id.whatapp);
        whatapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numerowhatapp(whatapp);
            }
        });


    }

    public void numerowhatapp(View view){
        TextView text = findViewById(R.id.txtwhatapp);

        text.setText("11 95762-6191");
    }

    public void contatoemail(View view){
        TextView text = findViewById(R.id.txtgmail);

        text.setText("viniciosbarbosa8@mail.com");
    }
}
