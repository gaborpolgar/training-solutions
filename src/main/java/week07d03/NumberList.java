package week07d03;

import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> list){
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i-1)){
                return false;
        }

        }
        return true;
    }
}
