package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaCredito extends AppCompatActivity {

    ImageView botaoVoltarCredito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_credito);
        botaoVoltarCredito = (ImageView) findViewById(R.id.btnVoltarCreditos);

        botaoVoltarCredito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}