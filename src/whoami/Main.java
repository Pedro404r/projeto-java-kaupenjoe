package whoami;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        String[] perguntas = new String[4];
        perguntas[0] = "Qual o nome do ser denominado de 'Bigodinho'?";
        perguntas[1] = "Quando ocorrou a primeira guerra mundial";
        perguntas[2] = "Qual o nome para cachorros mais comum no Brasil?";
        perguntas[3] = "Qual o sobrenome do maior apresentador brasileiro já visto?";

        String[] respostas = new String[4];
        respostas[0] = "Hitler";
        respostas[1] = "1945";
        respostas[2] = "Caramelo";
        respostas[3] = "Santos";

        // lista de strings
        List<String> maisQuestoes = new ArrayList<>();
        maisQuestoes.add("Qual o nome do maior jogador de futebol de todos os tempos?");
        maisQuestoes.add("Qual o nome do maior jogador de basquete de todos os tempos?");
        maisQuestoes.add("Nome da pior deputada trans brasileira");
    //  maisQuestoes.clear();
    
        Set<String> PaisesAVisitar = new HashSet<>();
        PaisesAVisitar.add("Japão");
        PaisesAVisitar.add("Canadá");
        PaisesAVisitar.add("Inglaterra");

        System.out.println(PaisesAVisitar);

        Map<String, Integer> populacaoCadaPais = new HashMap<>();
        populacaoCadaPais.put("Japão", 125000000);
        populacaoCadaPais.put("Canadá", 38000000);
        populacaoCadaPais.put("Inglaterra", 56000000);

        System.out.println(populacaoCadaPais.get("Japão"));

        for(int i = 0; i < maisQuestoes.size(); i++) {
            System.out.println(maisQuestoes.get(i));
        }
    }
}
