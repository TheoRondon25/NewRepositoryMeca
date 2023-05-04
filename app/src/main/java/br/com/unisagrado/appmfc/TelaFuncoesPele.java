package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaFuncoesPele extends AppCompatActivity {

    ImageView botaoVoltarFuncoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_funcoes_pele);
        botaoVoltarFuncoes = (ImageView) findViewById(R.id.btnVoltarFuncoes);

        botaoVoltarFuncoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}