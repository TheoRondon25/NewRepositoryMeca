package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaIntroTratamento extends AppCompatActivity {

    ImageView btnVoltarIntro;
    Button botaoFuncoesPele, botaoCaracteristicas, botaoMicrobiano, botaoCicatrizacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducao_tratamento);
        btnVoltarIntro = (ImageView) findViewById(R.id.btnVoltarIntro);
        botaoFuncoesPele = (Button) findViewById(R.id.btnFuncoesPele);
        botaoCaracteristicas = (Button) findViewById(R.id.btnCaracteristicas);
        botaoMicrobiano = (Button) findViewById(R.id.btnMicrobiano);
        botaoCicatrizacao = (Button) findViewById(R.id.btnCicatrizacao);

        btnVoltarIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        botaoFuncoesPele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaFuncoesPele();
            }
        });
        botaoCaracteristicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaCaracteristicas();
            }
        });
        botaoMicrobiano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaMicrobiano();
            }
        });
        botaoCicatrizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaCicatrizacao();
            }
        });
    }

    private void abreTelaCicatrizacao() {
        Intent TelaCicat = new Intent(this, TelaCicatrizacao.class);
        startActivity(TelaCicat);
    }

    private void abreTelaMicrobiano() {
        Intent TelaMicro = new Intent(this, TelaMicrobiano.class);
        startActivity(TelaMicro);
    }

    private void abreTelaCaracteristicas() {
        Intent TelaCarac = new Intent(this, TelaCaracteristicas.class);
        startActivity(TelaCarac);
    }

    private void abreTelaFuncoesPele() {
        Intent TelaFuncoes = new Intent(this, TelaFuncoesPele.class);
        startActivity(TelaFuncoes);
    }
}