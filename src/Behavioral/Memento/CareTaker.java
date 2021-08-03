package Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementosList = new ArrayList<Memento>();
    public void addMemento(Memento m){
        mementosList.add(m);
    }

    public Memento getMemento(int index) {
        return mementosList.get(index);
    }
}
