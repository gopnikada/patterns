package Structural.Decorator;

public abstract class Garnir implements MainDish {
    MainDish mainDish;

    public Garnir(MainDish mainDish) {
        this.mainDish = mainDish;
    }
}
