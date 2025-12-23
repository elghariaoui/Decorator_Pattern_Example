package net.soufiane.docorator;

import net.soufiane.composant.Boisson;

public class Decorateur extends Boisson {

    protected Boisson boisson;

    // Constructeur Decorateur pour décorer une boisson
    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public double cout() {
        return 0;
    }
}
