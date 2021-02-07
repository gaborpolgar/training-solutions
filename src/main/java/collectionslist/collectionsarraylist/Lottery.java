package collectionslist.collectionsarraylist;

import java.util.*;

public class Lottery {

    private final int LOTTERY_TYPE;
    private final int BALL_COUNT;

    public Lottery(int lotteryType, int ballCount) {
        LOTTERY_TYPE = lotteryType;
        BALL_COUNT = ballCount;
    }


//    public int getLottoType(){
//        int lotteryType;
//    try (Scanner scanner = new Scanner(System.in)){
//        lotteryType = scanner.nextInt();
//    }
//    return lotteryType;
//    }

    public List<Integer> selectWinningNUmbers(int lotteryType, int ballCount) throws IllegalArgumentException{
        if (ballCount <= lotteryType){
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }

        Random random = new Random();
        Set<Integer> lotterySet = new HashSet<>();
        while (lotterySet.size() != lotteryType ){
        lotterySet.add(random.nextInt(ballCount+1));
        }
        List<Integer> lotteryNumbers = new ArrayList<>(lotterySet);
        System.out.println(lotteryNumbers);
        Collections.sort(lotteryNumbers);
        System.out.println(lotteryNumbers);
        return lotteryNumbers;
    }


}
