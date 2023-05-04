package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaCaracteristicas extends AppCompatActivity {

    ImageView botaoVoltarCarac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_caracteristicas);
        botaoVoltarCarac = (ImageView) findViewById(R.id.btnVoltarCaracteristicas);

        botaoVoltarCarac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}