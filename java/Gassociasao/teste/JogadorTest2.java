package java.Gassociasao.teste;

import java.Gassociasao.Jogador;
import java.Gassociasao.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Kaka");
        Time time = new Time("Fluminense");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
