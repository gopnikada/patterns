package Structural.A;

public class Program {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);

        Round round = new Round(5);

        Triangle triangle = new Triangle(5);

        AdapterTriangleToSquare adapterTriangleToSquare = new AdapterTriangleToSquare(triangle);

        System.out.println(roundHole.fits(adapterTriangleToSquare));
    }
}
