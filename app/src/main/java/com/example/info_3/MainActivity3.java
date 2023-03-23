package com.example.info_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    public class Jogador{
        private String nome;
        private int pontos;

        public Jogador(String nomeJogador){

            nome = (nomeJogador.equals("")? "Jogador sem nome...coitado! ": nomeJogador );
            pontos = 0;
        }
        public String obterNome(){

            return nome;
        }
        public int obterPontos(){

            return pontos;
        }
        public void incrementarPontos(){

            pontos += 5;
        }
        public void decrementarPontos(){

            pontos--;
        }

    }

}