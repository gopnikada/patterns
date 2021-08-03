package Structural.A;

public class AdapterTriangleToSquare extends Round {
    private Triangle triangle;

    public AdapterTriangleToSquare(Triangle triangle){
        this.triangle = triangle;
    }

    @Override
    public double getRadius() {
        double radius;
        radius = triangle.getSide()+1;//dome businessLogik
        return radius;
    }
}
