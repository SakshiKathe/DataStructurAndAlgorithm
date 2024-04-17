package OOPsConcept;

import BitManipulation.count_set_bits;

public class Ass1 {
    public static void main(String[] args) {

    }
}

class Complex {
    int real, imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

}

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex((a.real * b.real), (a.imag * b.imag));
    }

public void printComple(){
    if(real == 0 && imag != 0){
        System.out.println();
    }
}