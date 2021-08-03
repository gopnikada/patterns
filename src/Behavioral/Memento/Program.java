package Behavioral.Memento;

public class Program {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("Speed: 15, timeleft: 5");
        originator.setState("Speed: 20, timeleft: 4");

        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("Speed: 30, timeleft: 3");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("Speed: 40, timeleft: 2");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("Speed: 50, timeleft: 1");

        originator.getState();

        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println("test1 : " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(1));
        System.out.println("test2 : " + originator.getState());


    }

}
