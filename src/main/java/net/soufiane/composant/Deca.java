package net.soufiane.composant;

public class Deca extends Boisson{

    public Deca() {
        description = "Deca";
        System.out.println("Deca");
    }

    @Override
    public double cout() {
        return 8;
    }
}
