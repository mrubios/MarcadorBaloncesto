package org.iesch.practica1.mainmarcador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.iesch.practica1.mainmarcador.databinding.ActivityResultadoBasketBinding;

public class ResultadoBasket extends AppCompatActivity {

    private ActivityResultadoBasketBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultadoBasketBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 1 - Recojo las puntuaciones que vienen del actuvity del marcador
        int localScore = getIntent().getExtras().getInt("localScore");
        int visitorScore = getIntent().getExtras().getInt("visitorScore");
        // 2 - dibujo las puntuaciones obtenidas y escribo el texto
        binding.lblMarcador.setText(String.valueOf(localScore) + " - " + String.valueOf(visitorScore));

        if (localScore > visitorScore){
            binding.lblResultado.setText(" Ganó el equipo local ");
        } else if (visitorScore > localScore){
            binding.lblResultado.setText(" Ganó el equipo visitançte ");
        } else {
            binding.lblResultado.setText(" Ha habido un empate ");
        }


    }
}