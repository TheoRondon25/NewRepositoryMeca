package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaHistoriaEvolucao extends AppCompatActivity {

    Button botaoHistoria, botaoEvolucao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_evolucao);
        botaoHistoria = (Button) findViewById(R.id.btnHistoria);
        botaoEvolucao = (Button) findViewById(R.id.btnEvolucao);

        botaoHistoria.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaHistoria();
            }
        }));
    }

    private void abreTelaHistoria() {
        Intent TelaHistoria = new Intent(this, TelaHistoria.class);
        startActivity(TelaHistoria);
    }
}