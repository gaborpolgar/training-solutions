package week04d01;

public class NameChanger {

    public static void main(String[] args) {
        NameChanger changer = new NameChanger("Takács Orsolya");
        changer.changeFirstName("Polgár");
        System.out.println(changer.fullName);
    }

    private String fullName;

    public NameChanger(String fullName) {
        if(fullName.isBlank() || fullName == null){
            throw new IllegalArgumentException("Invalid name:" + fullName);
        }
        this.fullName = fullName;
    }

    public void changeFirstName(String FristName){
        String tags [] = fullName.split(" ");
                fullName = FristName + " " + tags[1];
    }
}
