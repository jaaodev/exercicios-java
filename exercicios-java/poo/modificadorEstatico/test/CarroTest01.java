package poo.modificadorEstatico.test;

import poo.modificadorEstatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro carro1 = new Carro("Camaro", 300);
        Carro carro2 = new Carro("Audi", 295);
        Carro carro3 = new Carro("BMW", 290);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
