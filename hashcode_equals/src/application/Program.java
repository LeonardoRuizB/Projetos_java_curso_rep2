package application;

import entities.Client;

public class Program {

    public static void main(String[] args){

        // EQUALS

        String a = "Maria";
        String b = "Alex";

        System.out.println(a.equals(b));

        System.out.println();
        // HASHCODE

        String c = "Maria";
        String d = "Alex";

        System.out.println(c.hashCode());
        System.out.println(d.hashCode());

        System.out.println();
        // HASHCODE e EQUALS

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);

        System.out.println(s1 == s2);
    }
}
