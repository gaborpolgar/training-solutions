package statements;

import java.util.Scanner;

public class InvestMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, add your investment: ");
        int fund = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please, add the interest rate: ");
        int interestRate = scanner.nextInt();
        scanner.nextLine();
        System.out.print("A befektetés összege: " + fund );
        System.out.println(" A Kamatláb: ");
        System.out.println(interestRate);

        Investment investment = new Investment(fund, interestRate);
        System.out.println(investment.getFund());
        System.out.println(investment.getYield(365));
        Investment investmentTwo = new Investment(fund, interestRate);
        System.out.println(investmentTwo.close(100));
        System.out.println(investmentTwo.close(365));


    }
}
