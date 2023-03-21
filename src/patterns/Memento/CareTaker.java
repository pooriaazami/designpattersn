package patterns.Memento;

import java.util.Stack;

public class CareTaker {

    private Stack<Memento> history;

    public CareTaker() {
        history = new Stack<>();
    }

    public void push(Memento newState) {
        this.history.push(newState);
    }

    public Memento pop() {
        if (this.history.size() != 0) {
            return this.history.pop();
        }
        return null;
    }

}
