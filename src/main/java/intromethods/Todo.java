package intromethods;

public class Todo {

    private boolean finished;
    private String caption;

    public Todo(String caption) {
        this.caption = caption;
    }

    public void finish(){
    finished = true;
}

public String getCaption(){
    return caption;
}

public boolean isFinished(){
    return finished;
}


    @Override
    public String toString() {
        return caption + " (" + (finished ? "finished" : "not finished") + ")";
    }
}
