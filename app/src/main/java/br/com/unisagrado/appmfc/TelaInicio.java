package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaInicio extends AppCompatActivity {

    Button botaoHistoEvolucao, botaoIntro, botaoFisiologia, botaoAvaliacao, botaoTratamento;

    TextView botaoCredito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicio);
        botaoHistoEvolucao = (Button) findViewById(R.id.btnHistoEvolucao);
        botaoIntro = (Button) findViewById(R.id.btnIntroTratamento);
        botaoFisiologia = (Button) findViewById(R.id.btnFisiologia);
        botaoAvaliacao = (Button) findViewById(R.id.btnAvaliacao);
        botaoTratamento = (Button) findViewById(R.id.btnTratamento);
        botaoCredito = (TextView) findViewById(R.id.btnCreditos);

        botaoCredito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaCredito();
            }
        });
        botaoHistoEvolucao.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaHistEvol();
            }
        }));
        botaoIntro.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaIntroTratamento();
            }
        }));
        botaoFisiologia.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaFisiologia();
            }
        }));
        botaoAvaliacao.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) { abreTelaAvaliacao(); }
        }));
        botaoTratamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreTelaTratamento();
            }
        });

    }

    private void abreTelaCredito() {
        Intent TelaCred = new Intent(this, TelaCredito.class);
        startActivity(TelaCred);
    }

    private void abreTelaTratamento() {
        Intent TelaTrat = new Intent(this, TelaTratamentoFerida.class);
        startActivity(TelaTrat);
    }

    private void abreTelaHistEvol() {
        Intent TelaHistoEvol = new Intent(this, TelaHistoriaEvolucao.class);
        startActivity(TelaHistoEvol);
    }

    private void abreTelaIntroTratamento() {
        Intent TelaIntro = new Intent(this, TelaIntroTratamento.class);
        startActivity(TelaIntro);
    }

    private void abreTelaFisiologia() {
        Intent TelaFisiologia = new Intent(this, TelaFisiologia.class);
        startActivity(TelaFisiologia);
    }

    private void abreTelaAvaliacao() {
        Intent TelaAvaliacao = new Intent(this,TelaAvaliacao.class);
        startActivity(TelaAvaliacao);
    }
}