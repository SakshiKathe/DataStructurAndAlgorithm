package OOPsConcept;

public class OOPS_hierar {
    public static void main(String[] args) {
        Fish jelly = new Fish();
        jelly.eat();
        Bird b1 = new Bird();
        b1.breathe();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}