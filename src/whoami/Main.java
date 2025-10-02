package whoami;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        miniGames();
    }

    public static void miniGames(){
        System.out.println("Selecione o minigame que quer jogar");
        System.out.println("1: Palavras");

        Scanner scanner = new Scanner(System.in);
        String gameSelecionado = scanner.next();
        if(gameSelecionado.equals("1")) {
            MiniGamePalavra.PlayPalavra();
        } else{
            System.out.println("Desculpe, este jogo não está disponível");
        }

    }
}
