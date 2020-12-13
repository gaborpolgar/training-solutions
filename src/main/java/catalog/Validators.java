package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String item){
        if (item == null){
            return true;
        }
        return item.isBlank();
    }

    public static boolean isEmpty(List list){
        if (list == null){
            return true;
        }
        return list.isEmpty();
    }
}
