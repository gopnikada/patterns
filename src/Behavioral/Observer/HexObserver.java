package Behavioral.Observer;

public class HexObserver extends Observer{
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toHexString(this.subject.getState()));
    }
}
