package formatlocaleprintf;

import java.util.Locale;
import java.util.MissingFormatArgumentException;

public class PrintFormat {

    public static void main(String[] args) {
        PrintFormat printformat = new PrintFormat();
        System.out.println(printformat.printFormattedText(5));
    }

    public String checkException (String formatString, Integer i, Integer j){
            try {
                return String.format(new Locale("hu", "HU"), formatString, i, j);
            } catch (MissingFormatArgumentException ex){
                throw new IllegalArgumentException("Less objects then expected in format String", ex);
            }
    }

    public String printFormattedTex (Double number){
        String formatString = "Total is: %,2f Ft";
        return String.format(new Locale("hu", "HU"), formatString, number);
    }

    public String printFormattedText (int count, String fruit){
    String formatString = "We counted %d %s in the basket";
    return String.format(new Locale("hu", "HU"), formatString, count, fruit);
    }

    public String printFormattedText (int number){
        String formatString = "Right edge of numbers set at 4 spaces from text:%15d";
        return String.format(new Locale("hu", "HU"), formatString, number);
    }

    public String printFormattedText (Integer i, Integer j, Integer k){
    String formatString = "Multiple objects containing text:%d\t%d\t%d";
    return String.format(new Locale("hu", "HU"), formatString, i, j, k);
    }
}
