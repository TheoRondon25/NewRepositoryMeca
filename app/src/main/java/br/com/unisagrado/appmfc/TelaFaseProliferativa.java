package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaFaseProliferativa extends AppCompatActivity {

    ImageView botaoVoltarFProliferativa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_fase_proliferativa);
        botaoVoltarFProliferativa = (ImageView) findViewById(R.id.btnVoltarFProliferativa);

        botaoVoltarFProliferativa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}


