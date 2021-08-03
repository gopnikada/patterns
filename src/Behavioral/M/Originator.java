package Behavioral.M;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento makeMemento(){
        return new Memento(state);
    }
    public void getStateFromMemento(Memento m){
        state = m.getState();
    }
}
