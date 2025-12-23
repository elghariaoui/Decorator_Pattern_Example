package net.soufiane.composant;

public class Sumatra extends Boisson{

    public Sumatra() {
        description = "Sumatra";
        System.out.println("Sumatra");
    }

    @Override
    public double cout() {
        return 6;
    }
}
