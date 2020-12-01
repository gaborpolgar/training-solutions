package arrayofarrays;

public class ArrayOfArraysMain {

    public static void main(String[] args) {
       multiplicationTable(4);
    }

    public static int [] [] multiplicationTable (int size){
        int [] [] multi = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(multi [i] [j] = (i+1)*(j+1));
                System.out.print(" ");
            }
            System.out.println();
        }
        return multi;
    }
}
