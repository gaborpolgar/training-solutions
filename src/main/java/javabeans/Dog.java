package javabeans;

public class Dog {

    private String name;
    private int age;
    private boolean isPedigree;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPedigree() {
        return isPedigree;
    }

    public void setPedigree(boolean pedigree) {
        isPedigree = pedigree;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
