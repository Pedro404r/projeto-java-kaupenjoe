package whoami;
import java.util.Scanner;

public class MiniGamePalavra {
    static void PlayPalavra() {
        Scanner scanner = new Scanner(System.in);

        String[] perguntas = {
            "Qual é a capital da França?",
            "Qual elemento químico tem o símbolo H?",
            "Quem escreveu 'Dom Quixote'?"
        };
        String[] dicas = {
            "É conhecida como a cidade luz.",
            "É o elemento mais leve.",
            "Autor espanhol famoso."
        };
        String[] respostas = {
            "Paris",
            "H20",
            "Miguel Cervantes"
        };

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("Pergunta: " + perguntas[i]);
            System.out.println("Dica: " + dicas[i]);
            System.out.print("Sua resposta: ");
            String respostaUsuario = scanner.nextLine();

            if (respostaUsuario.equals(respostas[i])) {
            System.out.println("Correto!");
            } else {
            System.out.println("Errado! A resposta correta é: " + respostas[i] + "\n");
            }
        }

        System.out.println("Fim do minigame!");
}}
