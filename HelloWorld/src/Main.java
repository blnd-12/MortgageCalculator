import java.text.NumberFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        double mortgage;
        int principal ;
        int numberOfYears;
        float annualInterestRate;

        final byte MONTH_IN_YEAR = 12;
        final byte ONE_HUNDRED = 100;
        final byte EQUATION_RULE_NUMBER = 1;

        Scanner scan = new Scanner(System.in);

       while (true) {
           System.out.println("Principal: ");
           principal = scan.nextInt();

           if (principal >= 1000 && principal <= 1000000){

               break;

           } System.out.println("Invalid input");
       }


       while (true) {
           System.out.println("Annual Interest Rate: ");
           annualInterestRate = scan.nextFloat();
           annualInterestRate = (annualInterestRate / ONE_HUNDRED) / MONTH_IN_YEAR;

           if (annualInterestRate > 0 && annualInterestRate <= 30){

               break;
           } System.out.println("Invalid input");
       }
       while (true) {
           System.out.println("Period(Years): ");
           numberOfYears = scan.nextByte();
           numberOfYears = (numberOfYears * MONTH_IN_YEAR);

           if (numberOfYears >=1 && numberOfYears <= 30){

               break;
           }
       }

        mortgage = ((principal * annualInterestRate) * Math.pow((EQUATION_RULE_NUMBER + annualInterestRate), numberOfYears)) /
                ((Math.pow(EQUATION_RULE_NUMBER + annualInterestRate, numberOfYears)) - EQUATION_RULE_NUMBER);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormat);


    }
}
