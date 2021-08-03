package Behavioral.M;

public class Program {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        originator.setState("1");

        careTaker.addMemento(originator.makeMemento());
        originator.setState("2");

        careTaker.addMemento(originator.makeMemento());
        originator.setState("3");

        careTaker.addMemento(originator.makeMemento());

        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println(originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(1));
        System.out.println(originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(2));
        System.out.println(originator.getState());

    }
}
