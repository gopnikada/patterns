package Structural.A;

public class RoundHole {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(Round round){
        boolean result;
        result = (this.getRadius() >= round.getRadius());
        return result;
    }
}
