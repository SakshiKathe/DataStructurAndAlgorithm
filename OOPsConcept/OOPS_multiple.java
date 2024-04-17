package OOPsConcept;

public class OOPS_multiple {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.grass();
        b.meat();
        b.breathe();
    }
}

interface Herbivore {
    void grass();

    void breathe();
}

interface Carbivore {
    void meat();
}

class Bear implements Herbivore, Carbivore {
    public void grass() {
        System.out.println("Eats grass.");
    }

    public void breathe() {
        System.out.println("Breathes");
    }

    public void meat() {
        System.out.println("Eats Meat.");
    }
}
