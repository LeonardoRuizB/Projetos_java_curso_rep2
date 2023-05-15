package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        //HashSet = Mais rápido, porém não mantém a ordem
        //TreeSet = Mais lento, Manda de ordem alfabética
        //LinkedHasSet = Velocidade intermediaria, Matém a ordem em que são inseridos

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set) {
            System.out.println(p);
        }
    }
}