package week14d04;

import java.util.List;

public class ContractCreator {

    Contract template;

    public ContractCreator(String client, List<Integer> monthlyPrices) {
    template = new Contract(client, monthlyPrices);
    }

    public Contract create (String name){
        return new Contract(name, template.getMonthlyPrices());
    }
}
