package Behavioral.M;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento m){
        mementoList.add(m);
    }
    public Memento getMemento(int index){
        return mementoList.get(index);
    }
}
