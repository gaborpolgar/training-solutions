package week14d04;

import java.util.List;

public class ContractCreator {

    Contract template;

    public ContractCreator(String client, List<Integer> monthlyPrices) {
    Contract template = new Contract();
   template.setClient(client);
    template.setMonthlyPrices(monthlyPrices);
    }

    public Contract create (String name){
        ContractCreator contract = new ContractCreator(name, template.getMonthlyPrices());
                return contract.template;
    }
}
