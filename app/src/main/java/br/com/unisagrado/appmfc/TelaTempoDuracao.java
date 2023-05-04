package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaTempoDuracao extends AppCompatActivity {

    ImageView botaoVoltarTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_tempo_duracao);
        botaoVoltarTemp = (ImageView) findViewById(R.id.btnVoltarTempDur);

        botaoVoltarTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}