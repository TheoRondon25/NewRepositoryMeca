package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaFaseInflamatoria extends AppCompatActivity {

    ImageView botaoVoltarInflam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_fase_inflamatoria);
        botaoVoltarInflam = (ImageView) findViewById(R.id.btnVoltarFInflamatoria);

        botaoVoltarInflam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}