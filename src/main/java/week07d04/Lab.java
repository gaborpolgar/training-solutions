package week07d04;

import java.time.LocalDate;

public class Lab {

    private String title;

    private boolean completed;

    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
        this.completed = false;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        this.completed = true;
    }

    public void complete(){
        this.completedAt = LocalDate.now();
    }

    public void complete (LocalDate completedAt){
        this.completedAt = completedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Title: " + title);
        sb.append("\n completed: " + (completed? "Done" : "Not yet."));
        if (completed) {
            sb.append("\n at: " + completedAt );
        }
        return sb.toString();
    }
}
