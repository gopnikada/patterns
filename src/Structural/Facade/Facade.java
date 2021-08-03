package Structural.Facade;

import Structural.Facade.Shapes.Circle;
import Structural.Facade.Shapes.Square;
import Structural.Facade.Shapes.Triangle;

public class Facade {
    private Shape cicrle;
    private Shape triangle;
    private Shape square;

    public Facade() {
        cicrle = new Circle();
        triangle = new Triangle();
        square = new Square();
    }

    public void drawCircle(){
        cicrle.draw();
    }
    public void drawtriangle(){
        triangle.draw();
    }
    public void drawsquare(){
        square.draw();
    }
}
