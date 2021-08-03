package Behavioral.Observer;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinObserver(subject);
        new HexObserver(subject);

        subject.setState(15);
        subject.setState(60);
        subject.setState(7171);



    }
}
