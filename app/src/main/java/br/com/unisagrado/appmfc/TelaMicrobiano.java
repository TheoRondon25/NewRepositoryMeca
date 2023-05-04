package br.com.unisagrado.appmfc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaMicrobiano extends AppCompatActivity {

    ImageView botaoVoltarMicro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_microbiano);
        botaoVoltarMicro = (ImageView) findViewById(R.id.btnVoltarMicrobiano);

        botaoVoltarMicro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}