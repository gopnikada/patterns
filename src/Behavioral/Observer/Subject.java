package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void subscribe(Observer o){
        observers.add(o);
    }

    public void unsubscribe(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer o: observers){
            o.update();
        }
    }

    public void setState(int newState){
        this.state = newState;
        notifyObservers();
    }

    public int getState() {
        return state;
    }
}
