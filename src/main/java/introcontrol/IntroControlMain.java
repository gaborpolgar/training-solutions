package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        new IntroControlMain().run();
    }

    private void run() {
        IntroControl intro = new IntroControl();
        System.out.println(intro.subtractTenIfGreaterThanTen(10));

    }
}
