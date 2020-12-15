package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Lottery firstLottery = new Lottery();
        firstLottery.getNumbers();
        System.out.println(firstLottery.toString());

    }

    private List<Integer> lotteryNumbers = new ArrayList<>();

    public List<Integer> getNumbers (){
          Random random = new Random(1);
          int numb;
            for (int i = 0; i < 5;) {
          numb = random.nextInt(90) + 1;
              if ( !(lotteryNumbers.contains(numb))){
                      lotteryNumbers.add(numb);
                      i++;
              }
            }
        return lotteryNumbers;
        }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Az ötös lottó számok: ");
        for (int i = 0; i < lotteryNumbers.size(); i++) {
            sb.append(lotteryNumbers.get(i) + " ");
        };
        return sb.toString();
    }
}
