package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void risePrice(int percent) {
        price += (percent / 100.0) * price;
    }

    public int comparePriceperCapacity(Pendrive pd) {
        double ppc = pricePerCapacity();
        double pdPpc = pd.pricePerCapacity();
        if (ppc > pdPpc) {
            return 1;
        } else if (ppc < pdPpc){
    return - 1;
    } else {
        return 0;
    }
}

private double pricePerCapacity(){
        return (double) price/capacity;
}

public boolean cheaperThan(Pendrive other){
        return this.price < other.getPrice();
}
    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
