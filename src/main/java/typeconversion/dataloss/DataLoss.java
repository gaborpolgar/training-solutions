package typeconversion.dataloss;

public class DataLoss {

    public static void main(String[] args) {
        dataLoss();

    }

    public static void dataLoss(){
        long l;
        float f;
        int counter = 0;
        for (int i = 0;; i++) {
            f = l = i;
            l = (long) f;
            if (l != i){
                System.out.println(i);
                System.out.println(l);
                System.out.println(Integer.toBinaryString(i).length());

                counter++;
            }
            if(counter == 3){
                break;
            }
        }

    }
}
