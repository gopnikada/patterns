package Behavioral.Observer;

public class BinObserver extends Observer{


    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toBinaryString(this.subject.getState()));
    }
}
