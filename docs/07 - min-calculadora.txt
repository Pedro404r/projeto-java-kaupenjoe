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
        // calculadora simples
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        System.out.println("Escolha a operação (+, -, *, /):");
        String operacao = scanner.next();
        double resultado = 0;
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Operação inválida!");
                return;


    }
        System.out.println("Resultado: " + resultado);
        scanner.close();
}}
