package whoami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pontosCompletos = 100;
        int pontosAtuais = 100;

        int pontosFaltando = pontosCompletos - pontosAtuais * 1;

        boolean verificarPontos = pontosAtuais >= pontosCompletos;

        System.out.println("Você tem uma pontuação de: " + pontosAtuais);
        System.out.println("Você tem os pontos suficientes para passar? " + verificarPontos);
        System.out.println("Faltam: " + pontosFaltando);
        

     
    }
}
