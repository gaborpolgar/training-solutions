package week09d03;

import java.util.Random;

public class Person {

    private String name;
    private int Age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        Age = age;
        if (age < 14){
            setPresent();
        }
        }

    public void setPresent() {
        int randomPresentIndex = new Random().nextInt(4);
        Present [] presents = Present.values();
        this.present = presents[randomPresentIndex];
    }
}
