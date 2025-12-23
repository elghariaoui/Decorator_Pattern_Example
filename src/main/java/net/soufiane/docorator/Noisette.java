package net.soufiane.docorator;

import net.soufiane.composant.Boisson;

public class Noisette extends Decorateur {

    public Noisette(Boisson boisson) {
        super(boisson);
        System.out.println("Ajout de Noisette");
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " + Noisette";
    }

    @Override
    public double cout() {
        return boisson.cout() + 1;
    }
}
