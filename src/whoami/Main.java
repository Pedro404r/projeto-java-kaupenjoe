package whoami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto de vida você tem?");
        int vida = scanner.nextInt();
        boolean estaVivo = vida > 0;

        if(estaVivo) {
            System.out.println("Você está vivo!");
        } else {
            System.out.println("Parece que você está morto..");
        }

        int pontos = scanner.nextInt();

        if(pontos >= 100) {
            System.out.println("Você foi muito bem!");
        } else if(pontos >= 50) {
            System.out.println("Resultado mediano!");
        } else {
            System.out.println("Você não passou!");
        }
    }
}
