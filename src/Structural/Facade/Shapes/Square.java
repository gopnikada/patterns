package Structural.Facade.Shapes;

import Structural.Facade.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square draws!");
    }
}
