package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaTratamentoFerida extends AppCompatActivity {

    Button botaoAvaliacaoCondicoes, botaoControleDor;
    ImageView botaoVoltarTratamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_tratamento_ferida);
        botaoVoltarTratamento = (ImageView) findViewById(R.id.btnVoltarTratamento);
        botaoAvaliacaoCondicoes = (Button) findViewById(R.id.btnAvaliacaoCondicoes);
        botaoControleDor = (Button) findViewById(R.id.btnControleDor);

        botaoVoltarTratamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        botaoAvaliacaoCondicoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaAvaliacaoCondicoes();
            }
        });
        botaoControleDor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaControleDor();
            }
        });
    }

    private void abreTelaControleDor() {
        Intent TelaContDor = new Intent(this,TelaControleDor.class);
        startActivity(TelaContDor);
    }

    private void abreTelaAvaliacaoCondicoes() {
        Intent TelaAvalCond = new Intent(this,TelaAvaliacaoCondicoes.class);
        startActivity(TelaAvalCond);
    }
}