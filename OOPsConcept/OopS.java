//Static Keyword
package OOPsConcept;

public class OopS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JMV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";
        System.out.println(s3.returnPercentage(90, 80, 75));
    }
}

class Student {
    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void getName(String name) {
        this.name = name;
    }

    String setName() {
        return this.name;
    }
}
