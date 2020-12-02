package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public static void main(String[] args) {
        ArraysMain main = new ArraysMain();
        int [] selected = {87, 55, 34, 77, 1};
        int [] winningNumbers = {1, 77, 34, 87, 55};
        System.out.println(main.wonLottery(selected, winningNumbers));
        for (int numb:winningNumbers) {
            System.out.print(numb+ " ");
        }
    }

    public String numberOfDaysAsString() {
        int numberOfDays = 7;
        return Integer.toString(numberOfDays);
    }

    public List<String> daysOfWeek(){
        return Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");
    }

    public static String multiplicationTableAsString(int size){
        int [] [] multi = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(multi [i] [j] = (i+1)*(j+1));
                System.out.print(" ");
            }
        }
    return multi.toString();
    }
    
    public void sameTempValues(double [] day, double[] anotherDay){
        for (int i = 0; i < day.length; i++) {
            for (int j = 0; j < anotherDay.length; j++) {
                if (day[i] == anotherDay[j]){
                    continue;
            } else {
                    break;
                }
        }
        }
    }

    public boolean wonLottery(int[] selected, int[] drawn){
        int sortedSelected[] = Arrays.copyOf(selected, 5);
        int sortedDrawn[] = Arrays.copyOf(drawn, 5);

        Arrays.sort(sortedSelected);
        Arrays.sort(sortedDrawn);

        for (int i = 0, j = 0; i < drawn.length; i++, j++) {
                System.out.print(sortedSelected[j] +" ");
            System.out.print(sortedDrawn[i]+ " ");
                System.out.println();
                if(!(sortedDrawn[i] == sortedSelected[j])){
                    return false;
                }
            }
        return true;
        }

    }

