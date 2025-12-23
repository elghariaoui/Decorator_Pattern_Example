package net.soufiane.docorator;

import net.soufiane.composant.Boisson;

public class Caramel extends Decorateur {

    public Caramel(Boisson boisson) {
        super(boisson);
        System.out.println("Ajout de Caramel");
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " + Caramel";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.75;
    }
}
