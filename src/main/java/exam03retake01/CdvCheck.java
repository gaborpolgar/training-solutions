package exam03retake01;

public class CdvCheck {

    private static final int LENGTH = 10;

    public static void main(String[] args) {
        new CdvCheck().check("8365670004");
    }

    public boolean check(String cdv) {
        if (cdv.length() != LENGTH || notNumber(cdv)) {
            throw new IllegalArgumentException("The number must be consist only and exactly ten digits");
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(cdv.charAt(i));
            sum += digit * (1+i);
        }
        int tenth = sum % 11;
        return tenth == (Character.getNumericValue(cdv.charAt(9)));
    }

    private boolean notNumber(String cdv){
         try {
            Long.parseLong(cdv);
            return false;
        }
        catch (NumberFormatException nfe){
            return true;
        }
    }

}
