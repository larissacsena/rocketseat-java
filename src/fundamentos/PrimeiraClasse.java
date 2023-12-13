package fundamentos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimeiraClasse {
    public static void main(String[] args) {



        List <String> nomes = new ArrayList<>();
        nomes.add("Larissa");
        nomes.add("Matheus");
        nomes.add("Bianca");

        for(String nome : nomes){
            //System.out.println(nome);
        }
        //mesma coisa que encima
        //nomes.forEach(nome -> System.out.println("Nome: " + nome));

        //peguei MAP (interface) HashMap é um MAP (superclasse e subclasse)
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Larissa", 10);
        notas.put("Milady", 9);

        //mesma coisa que integer, pq já ta definido que vai retornar um integer
        var nota = notas.get("Larissa");
        Integer nota1 = notas.get("Milady");

        //as entradas do meu map são do tipo     *No meu hash map notas eu pego entryet que percorre o conjunto de entradas
        //String e Integer e eu chamei de dados  *
        //map é a interface
        for (Map.Entry<String, Integer>dadosDaColecao : notas.entrySet()){

            String key = dadosDaColecao.getKey();
            Integer value = dadosDaColecao.getValue();
            System.out.println(key + value);
        }
    }

}
