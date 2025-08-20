package whoami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int nome = 1;
       int idade = 24;
       System.out.println(nome);
       System.out.println(idade);

       System.out.println("Por favor, agora insira sua idade");
       Scanner scanner = new Scanner(System.in);
       int numero = scanner.nextInt(); // vai salvar o armazenamento na variavel numero
     
       System.out.println("Você escolheu o número " + numero);

       System.out.println("Por favor, digite o seu nome");

       String input = scanner.next();

       System.out.println("Seu nome é: " + input);

       System.out.println("Formulario teste!");
;    }
}