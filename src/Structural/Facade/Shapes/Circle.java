package Structural.Facade.Shapes;

import Structural.Facade.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle draws!");
    }
}
