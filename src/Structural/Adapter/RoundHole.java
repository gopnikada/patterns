package Structural.Adapter;

public class RoundHole {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg roundPeg){
        boolean result;
        result = (this.getRadius() >= roundPeg.getRadius());
        return result;
    }
}
