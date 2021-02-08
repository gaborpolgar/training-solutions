package collectionsqueue.collectionsdeque;

import collectionsqueue.job.Job;
import collectionsqueue.job.NoJobException;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class JobQueue {

    public Deque<Job> addJobByUrgency (Job... jobs){
        Deque<Job> row = new ArrayDeque<>();
        for (Job job: jobs) {
            if (job.isUrgent()){
              row.addFirst(job);
              continue;
            }
            row.addLast(job);
        }
        return row;
    }

    public Job dispatchUrgentJob (Deque<Job> jobs) throws NoJobException {
        if (jobs.isEmpty()){
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.getFirst();
    }

    public Job dispatchNotUrgentJob (Deque<Job> jobs) throws NoJobException {
        if (jobs.isEmpty()){
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.getLast();
    }
}
