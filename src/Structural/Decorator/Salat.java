package Structural.Decorator;

public class Salat extends Garnir{
    public Salat(MainDish mainDish) {
        super(mainDish);
    }

    @Override
    public void printInfo() {
        mainDish.printInfo();
        System.out.print("Salat, ");
    }

    @Override
    public double getPrice() {
        return mainDish.getPrice() + 7;
    }
}
