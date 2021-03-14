package exam03retake02;

public class Todo {

    private String text;
    private int priority;

    public Todo(String text, int priority) {
        this.text = text;
        if (priority < 1 || priority > 5){
            throw new IllegalArgumentException("The priority must be between 1 and 5!");
        }
        this.priority = priority;
        this.state = State.NON_COMPLETED;
    }

    private State state;

    public String getText() {
        return text;
    }

    public int getPriority() {
        return priority;
    }

    public State getState() {
        return state;
    }

    public void complete() {
        state = State.COMPLETED;
    }

}
