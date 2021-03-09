package com.example.apppedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");
    }
    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }
    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void opcaoSelecionada(String opcaoSelecionada) {
        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView vencedor = findViewById(R.id.vencedor);

        int aleatorio = new Random().nextInt(3);
        String[] opcoes = {"pedra","papel","tesoura"};
        String opcaoApp = opcoes[aleatorio];

        switch (opcaoApp){
            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
        }

        if (
                opcaoApp == "pedra" && opcaoSelecionada == "tesoura"
                || opcaoApp == "papel" && opcaoSelecionada == "pedra"
                || opcaoApp == "tesoura" && opcaoSelecionada == "papel"
        ){
            vencedor.setText("Você PERDEU o app ganhou");


        }else if(
                opcaoApp == "tesoura" && opcaoSelecionada == "pedra"
                || opcaoApp == "pedra" && opcaoSelecionada == "papel"
                || opcaoApp == "papel" && opcaoSelecionada == "tesoura"
        ) {
            vencedor.setText("Você GANHOU o app perdeu");
        }else {
            vencedor.setText("Empate");
        }




    }

}