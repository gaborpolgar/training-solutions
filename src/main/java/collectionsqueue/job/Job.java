package collectionsqueue.job;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

public class Job implements Comparable<Job> {

    private final int priority;
    private final String jobDescription;
    private final boolean urgent;

    public Job(int priority, String jobDescription) {
        this.priority = priority;
        this.jobDescription = jobDescription;
        this.urgent = priority<5;
    }

    public int getPriority() {
        return priority;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public boolean isUrgent() {
        return urgent;
    }

    @Override
    public String toString() {
        return "priority: " + priority +
                "\n jobDescription: " + jobDescription + '\'' +
                urgent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return priority == job.priority && Objects.equals(jobDescription, job.jobDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, jobDescription);
    }


    @Override
    public int compareTo(@NotNull Job o) {
        return this.priority - o.priority;
    }
}
