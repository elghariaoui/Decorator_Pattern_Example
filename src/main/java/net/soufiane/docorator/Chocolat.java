package net.soufiane.docorator;

import net.soufiane.composant.Boisson;

public class Chocolat extends Decorateur {

    public Chocolat(Boisson boisson) {
        super(boisson);
        System.out.println("Ajout de Chocolat");
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " + Chocolat";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.5;
    }

}
