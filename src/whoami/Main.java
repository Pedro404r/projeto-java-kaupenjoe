package whoami;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número da operação:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número da operação:");
        int num2 = scanner.nextInt();
        System.out.println("Selecione a operação desejada:");
        System.out.println("* Para multiplicação");
        System.out.println("/ Para divisão");
        System.out.println("+ Para adição");
        System.out.println("- Para subtração");

        String calcSelect = scanner.next();

        int resultado = 0;
        boolean operacaoValida = true;

        switch (calcSelect) {
            case "*":
                resultado = operMulti(num1, num2);
                break;
            case "/":
                resultado = operDivis(num1, num2);
                break;
            case "+":
                resultado = operAdic(num1, num2);
                break;
            case "-":
                resultado = operSubtr(num1, num2);
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }
    }

    public static int operMulti(int a, int b) {
        return a * b;
    }

    public static int operDivis(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }

    public static int operAdic(int a, int b) {
        return a + b;
    }

    public static int operSubtr(int a, int b) {
        return a - b;
    }
}
