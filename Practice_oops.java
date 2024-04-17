// public class Practice_oops {
//     public static void main(String[] args) {
//         Vehicle obj1 = new Car();
//         obj1.print();

//         Vehicle obj2 = new Vehicle();
//         obj2.print();
//     }
// }

// class Vehicle {
//     void print() {
//         System.out.println("Base class (Vehicle).");
//     }
// }

// class Car extends Vehicle {
//     void print1() {
//         System.out.println("Derived class(Car).");
//     }
// }

// public class Practice_oops {
//     public static void main(String[] args) {
//         System.out.print(Book.count);
//         Book b1 = new Book(150);
//         Book b2 = new Book(250);
//         Book b3 = new Book(260);
//         System.out.println(Book.count);
//     }
// }

// class Book {
//     int price;
//     static int count;

//     public Book(int price) {
//         this.price = price;
//         count++;
//     }
// }

public class Practice_oops {
    public static void main(String[] args) {
        Test t = new Test();
        t.set_marks(98);
        System.out.println(Test.marks);
    }
}

class Test {
    static int marks;

    void set_marks(int marks) {
        this.marks = marks;
    }
}