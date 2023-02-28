package java.Gassociasao.teste;

import java.Gassociasao.Jogador;

public class Jogadorteste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Kaka");
        Jogador jogador2 = new Jogador("Vn");
        Jogador jogador3 = new Jogador("Marcelo");
        Jogador[] jogadores = new Jogador[3];
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }

}
