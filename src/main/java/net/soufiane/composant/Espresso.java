package net.soufiane.composant;

public class Espresso extends Boisson{

    public Espresso() {
        description = "Espresso";
        System.out.println("Espresso");
    }

    @Override
    public double cout() {
        return 12;
    }
}
