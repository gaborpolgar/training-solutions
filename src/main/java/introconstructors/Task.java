package introconstructors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {

    public static void main(String[] args) {
        Task task = new Task("etetés", "Baba etetése tejjel.");
    task.start();
        System.out.println(task.getStartDateTime());
    }

    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void start() {
        this.startDateTime = LocalDateTime.now();
    }


}
