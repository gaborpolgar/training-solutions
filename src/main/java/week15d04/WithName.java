package week15d04;


public class WithName{

    protected String name;

            public String addFive(String s) {
                return s + 5;
            }

            public static void main(String[] args) {
                System.out.println(new WithName().addFive("10"));
            }
        }