package whoami;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       // adicionar usuario simples
       System.out.println("Por favor digite o nome do usuario novo");
       Scanner scanner = new Scanner(System.in);
       String nome = scanner.nextLine();

       System.out.println("Agora digite qual será a senha dele");
       String senha = scanner.nextLine();
       
       System.out.println("Agora digite o cargo dele");

         String cargo = scanner.nextLine();

        
         System.out.println("Você criou um novo usuário com sucesso!");
         System.out.println("Nome: " + nome);
         System.out.println("Senha: " + senha);
         System.out.println("Cargo: " + cargo);

        
}}
