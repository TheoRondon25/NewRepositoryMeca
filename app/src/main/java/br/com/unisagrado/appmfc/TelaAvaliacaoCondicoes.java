package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaAvaliacaoCondicoes extends AppCompatActivity {

    ImageView botaoVoltarAvaliacaoCondicoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_avaliacao_condicoes);
        botaoVoltarAvaliacaoCondicoes = (ImageView) findViewById(R.id.btnVoltarAvaliacaoCondicoes);

        botaoVoltarAvaliacaoCondicoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}