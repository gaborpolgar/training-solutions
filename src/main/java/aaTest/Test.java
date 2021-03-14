package aaTest;

public class Test {

    private String a;

    public static void main(String[] args) {
        new Test().testVariableInitializator();

    }

    private void testVariableInitializator() {
        try{
            a = "a";
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }
}
