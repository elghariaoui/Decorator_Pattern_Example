package net.soufiane;

import net.soufiane.composant.Boisson;
import net.soufiane.composant.Espresso;
import net.soufiane.composant.Sumatra;
import net.soufiane.docorator.Caramel;
import net.soufiane.docorator.Chocolat;
import net.soufiane.docorator.Noisette;

public class Main {
    public static void main(String[] args) {
        Boisson boisson = new Sumatra();
        System.out.println("Description: " + boisson.getDescription());
        System.out.println("Cout: " + boisson.cout());

        boisson = new Espresso();
        System.out.println("Description: " + boisson.getDescription());
        System.out.println("Cout: " + boisson.cout());

        // test decorateur
        System.out.println("----- Avec Decorateur -----");
        boisson = new Chocolat(boisson);
        System.out.println("Description: " + boisson.getDescription());
        System.out.println("Cout: " + boisson.cout());

        boisson = new Caramel(boisson);
        System.out.println("Description: " + boisson.getDescription());
        System.out.println("Cout: " + boisson.cout());

        boisson = new Chocolat(boisson);
        System.out.println("Description: " + boisson.getDescription());
        System.out.println("Cout: " + boisson.cout());

        boisson = new Noisette(boisson);
        System.out.println("Description: " + boisson.getDescription());
        System.out.println("Cout: " + boisson.cout());

    }
}