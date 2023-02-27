package java.Fmodificadorestatico.teste;

import java.Fmodificadorestatico.Carro;

public class carroteste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Bmw", 280);
        Carro c2 = new Carro("Palio", 150);
        Carro c3 = new Carro("Audi", 270);
        Carro.velocidadeLimite = 190;
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
    
// nao precisa de objeto pois o estatico altera todos os valores dessa classe
}

 