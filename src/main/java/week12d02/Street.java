package week12d02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Street {

    List<Site> sites = new ArrayList<>();

    public void sellSite (Site site){
        sites.add(site);
    }

    public int NumberOfLastSoldSite(){
            int oddCounter = 0;
            int evenCounter = 0;
            int result = 0;
        for (int i = 0; i < sites.size()-1; i++) {
            if (sites.get(i).getOddorEven().getNumber()== 1){
                oddCounter++;
            } else {
                evenCounter++;
            }
        }
        if (sites.get(sites.size()-1).getOddorEven().getNumber() == 1){
            result = 1+(2*oddCounter);
        } else {
            result = 2+(2*evenCounter);
        }
        return result;
    }

    public HashMap<Fence, Integer> soldingStatistic(){
        HashMap<Fence, Integer> stat = new HashMap<>();
        for (Site site: sites) {
            stat.put(site.getFence(), stat.containsKey(site.getFence())? stat.get(site.getFence()) + 1 : 1);
        }
        return stat;
    }
}
