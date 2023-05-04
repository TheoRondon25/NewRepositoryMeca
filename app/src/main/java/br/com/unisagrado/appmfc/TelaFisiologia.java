package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaFisiologia extends AppCompatActivity {

    ImageView btnVoltarFisiologia;
    Button botaoFaseInflamatoria, botaoFaseProliferativa, botaoFaseMaturacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisiologia);
        btnVoltarFisiologia = (ImageView) findViewById(R.id.btnVoltarFisio);
        botaoFaseInflamatoria = (Button) findViewById(R.id.btnFaseInflamatoria);
        botaoFaseProliferativa = (Button) findViewById(R.id.btnFaseProliferativa);
        botaoFaseMaturacao = (Button) findViewById(R.id.btnFaseMaturacao);

        btnVoltarFisiologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        botaoFaseInflamatoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaFaseInflamatoria();
            }
        });
        botaoFaseProliferativa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaFaseProliferativa();
            }
        });
        botaoFaseMaturacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaFaseMaturacao();
            }
        });

    }

    private void abreTelaFaseMaturacao() {
        Intent TelaMatur = new Intent(this, TelaFaseMaturacao.class);
        startActivity(TelaMatur);
    }

    private void abreTelaFaseProliferativa() {
        Intent TelaProlifera = new Intent(this, TelaFaseProliferativa.class);
        startActivity(TelaProlifera);
    }

    private void abreTelaFaseInflamatoria() {
        Intent TelaInflama = new Intent(this, TelaFaseInflamatoria.class);
        startActivity(TelaInflama);
    }

}