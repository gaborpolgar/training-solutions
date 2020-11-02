package classstructuremethods;

public class Client {

    private String name;
    private String address;
    private int year;

    public void migrate( String address){
    setAddress(address);
    }

    public Client(String name, String address, int year) {
        this.name = name;
        this.address = address;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
