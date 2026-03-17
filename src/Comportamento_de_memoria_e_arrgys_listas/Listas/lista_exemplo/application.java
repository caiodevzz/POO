package Comportamento_de_memoria_e_arrgys_listas.Listas.lista_exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class application {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2 , "Caio");

        System.out.println(list.size());

        list.removeIf(nomes -> nomes.charAt(0) == 'M');

        for (String nomes : list) {
            System.out.println(nomes);
        }

        System.out.println("Idex of Caio: " + list.indexOf("Caio"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
