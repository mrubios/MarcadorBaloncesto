package org.iesch.practica1.mainmarcador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.iesch.practica1.mainmarcador.databinding.ActivityResultadoBasketBinding;

public class ResultadoBasket extends AppCompatActivity {

    private ActivityResultadoBasketBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        int localScore = getIntent().getExtras().getInt("localScore");
        int visitorScore = getIntent().getExtras().getInt("visitorScore");

        binding.lblMarcador.setText(String.valueOf(localScore)+ " - " + String.valueOf(visitorScore));

        if (localScore>visitorScore){
            binding.lblResultado.setText("Ganó el equipo local");
        }
        else  if (visitorScore>localScore)
        {
            binding.lblResultado.setText("Ganó el equipo visitante");
        }
        else{
            binding.lblResultado.setText("Empate");

        }


    }
}