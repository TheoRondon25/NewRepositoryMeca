package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaFaseMaturacao extends AppCompatActivity {

    ImageView botaoVoltarMatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_fase_maturacao);
        botaoVoltarMatura = (ImageView) findViewById(R.id.btnVoltarFMaturacao);

        botaoVoltarMatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}