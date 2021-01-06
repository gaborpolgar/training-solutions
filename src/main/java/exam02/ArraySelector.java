package exam02;

public class ArraySelector {

    public String selectEvens(int [] elements){
        if (elements.length == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < elements.length; i++) {
            if (i%2 == 0 || i == 0){
               sb.append(elements[i]);
            }
        }
        return sb.append("]").toString();
    }
}
