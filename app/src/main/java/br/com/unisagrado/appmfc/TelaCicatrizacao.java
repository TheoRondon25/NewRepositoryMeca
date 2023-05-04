package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaCicatrizacao extends AppCompatActivity {

    ImageView botaoVoltarCicat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cicatrizacao);
        botaoVoltarCicat = (ImageView) findViewById(R.id.btnVoltarCicatrizacao);

        botaoVoltarCicat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}