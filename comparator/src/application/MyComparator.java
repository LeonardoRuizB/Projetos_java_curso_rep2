package application;

import entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        //toUpperCase serve para deixar a escrita maiuscula, para não ter erro de letra maiuscula e minuscula.
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
