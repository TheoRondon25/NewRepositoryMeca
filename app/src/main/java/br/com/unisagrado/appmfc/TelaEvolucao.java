package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaEvolucao extends AppCompatActivity {

    ImageView botaoVoltarEvolucao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_evolucao);
        botaoVoltarEvolucao = (ImageView) findViewById(R.id.btnVoltarEvolucao);

        botaoVoltarEvolucao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}