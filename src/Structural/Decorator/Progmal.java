package Structural.Decorator;

public class Progmal {
    public static void main(String[] args) {
        MainDish m1 = new Grecka(new Grecka(new Salat(new Otbivnaya())));
        MainDish m2 = new Salat(new Salat(new Salat(new Solyanka())));

        m2.printInfo();
        System.out.println(m2.getPrice());
    }
}
