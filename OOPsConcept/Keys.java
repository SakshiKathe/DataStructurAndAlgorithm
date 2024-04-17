//Super keyword
package OOPsConcept;

public class Keys {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}

class Animal {
    Animal() {
        System.out.println("animal constructor is called.");
    }
}

class Horse extends Animal {
    Horse() {
        super();
        System.out.println("Horse costructor is called.");
    }
}