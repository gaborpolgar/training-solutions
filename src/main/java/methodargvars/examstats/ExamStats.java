package methodargvars.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        int counter = 0;
        if (results == null) {
            throw new IllegalArgumentException("The results array don't be null!");
        }
        for (int i = 0; i < results.length; i++) {
            int result = (int) (results[i] / maxPoints * 100.0);
            if (result > limitInPercent) {
                counter++;
            }
        }
        return counter;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null) {
            throw new IllegalArgumentException("The results array don't be null!");
        }
        for (int i = 0; i < results.length; i++) {
            int result = (int) (results[i] / maxPoints * 100.0);
            if (result <= limitInPercent) {
                return true;
            }
        }
        return false;
    }
}
