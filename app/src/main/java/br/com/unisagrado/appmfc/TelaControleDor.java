package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaControleDor extends AppCompatActivity {

    ImageView botaoVoltarControleDor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_controle_dor);
        botaoVoltarControleDor = (ImageView) findViewById(R.id.btnVoltarControleDor);

        botaoVoltarControleDor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}