package exceptionmulticatch.converter;

import java.lang.reflect.Array;

public class BinaryStringConverter {

    private boolean [] boos;

    public boolean [] binaryStringToBooleanArray(String text) throws IllegalArgumentException{
        boolean[] boos = new boolean[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 0) {
                boos[i] = false;
            } else if (text.charAt(i) == 1) {
                boos[i] = true;
            }
        }
        return boos;
    }

        public String booleanArrayToBinaryString(boolean [] boos) throws IllegalArgumentException{
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < boos.length; i++) {
                if (boos[i] == true){
                sb.append(1);
            } else if (boos[i] == false){
                    sb.append(0);
                }
        }
        return sb.toString();
    }
}
