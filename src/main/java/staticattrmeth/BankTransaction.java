package staticattrmeth;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class BankTransaction {

    private long trxValue;
    private static final int MIN = 1;
    private static final int MAX = 10_000_000;
    private static long countTrx = 0;
    private static BigDecimal sumOfTrxs = new BigDecimal(0);
    private static long currentMinValue;
    private static long currentMaxValue;

    public BankTransaction(long trxValue) {
        if (trxValue <= MIN && trxValue >= MAX) {
            throw new IllegalArgumentException("This transaction cannot be excepted! " + trxValue);
        }
        countTrx++;
        sumOfTrxs = sumOfTrxs.add(new BigDecimal(Long.toString(trxValue)));
        if (trxValue < currentMinValue) currentMinValue = trxValue;
        if (trxValue > currentMaxValue) currentMaxValue = trxValue;
        this.trxValue = trxValue;
    }

    public static void initTheDay() {
        countTrx = 0;
        sumOfTrxs = new BigDecimal("0");
        currentMinValue = MAX;
        currentMaxValue = MIN;
    }

    public static BigDecimal averageOfTransaction() {
        return countTrx == 0 ? new BigDecimal("0") : sumOfTrxs.divide(new BigDecimal(Long.toString(countTrx)), 0, RoundingMode.HALF_UP);
    }

    public static long getCurrentMinValue() {
        return countTrx == 0 ? 0 : currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return countTrx == 0 ? 0 : currentMaxValue;
    }

    public static BigDecimal getSumOfTrxs() {
        return sumOfTrxs;
    }

    public long getTrxValue() {
        return trxValue;
    }
}