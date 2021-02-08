package collectionsset.collectionshashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StringsHandler {

    public Set<String> filterUniqueStrings(Collection<String> stringCollection) {
        return new HashSet<>(stringCollection);
    }

    public Set<String> selectIdenticalStrings(Set<String> setA, Set<String> setB) {
        setA.retainAll(setB);
        return setA;
//        Set<String> resultSet = new HashSet<>();
//        for (String b: setB) {
//        if (setA.remove(b)){
//            resultSet.add(b);
//        }
//        }
//        return resultSet;
    }
}