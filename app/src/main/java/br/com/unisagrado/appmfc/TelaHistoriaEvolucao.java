package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaHistoriaEvolucao extends AppCompatActivity {

    Button botaoHistoria, botaoEvolucao;
    ImageView btnImagemVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_evolucao);
        botaoHistoria = (Button) findViewById(R.id.btnHistoria);
        botaoEvolucao = (Button) findViewById(R.id.btnEvolucao);
        btnImagemVoltar = (ImageView) findViewById(R.id.btnVoltarIntro);

        botaoHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaHistoria();
            }
        });
        botaoEvolucao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaEvolucao();
            }
        });
        btnImagemVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
   public void onBackPressed() {
        super.onBackPressed();
    }
    private void abreTelaHistoria() {
        Intent TelaHistoria = new Intent(this, TelaHistoria.class);
        startActivity(TelaHistoria);
    }

    private void abreTelaEvolucao() {
        Intent TelaEvolucao = new Intent(this, TelaEvolucao.class);
        startActivity(TelaEvolucao);
    }
}