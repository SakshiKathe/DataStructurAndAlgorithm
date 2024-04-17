package OOPsConcept;

public class OOPS_abs {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // // Chicken c = new Chicken();
        // // c.eat();
        // // c.walk();

        Mustang myHorse = new Mustang();
        // Animal->Horse->Mustang
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal comstructor called");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on four legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "Yellow";
    }

    void walk() {
        System.out.println("walks on two legs");
    }
}
