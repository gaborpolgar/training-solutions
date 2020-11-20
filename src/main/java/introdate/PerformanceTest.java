package introdate;

import java.time.LocalDate;

public class PerformanceTest {

    public static void main(String[] args) {
        new PerformanceTest().run();
    }

    private void run() {
        Performance performance = new Performance("Queen", LocalDate.of(1989, 04, 01), 18, 00, 20, 00);
        performance.getInfo();

    }
}
