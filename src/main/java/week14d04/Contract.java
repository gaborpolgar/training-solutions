package week14d04;

import java.util.List;

public class Contract {

    private String client;
    private List<Integer> monthlyPrices;

    public void setClient(String client) {
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    public List<Integer> getMonthlyPrices() {
        return monthlyPrices;
    }

    public void setMonthlyPrices(List<Integer> monthlyPrices) {
        this.monthlyPrices = monthlyPrices;
    }
}
