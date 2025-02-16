package src;
import java.util.Scanner;
public class Compound_Interest_Calculator {
    public static void main(String [] args) {


        Scanner sc = new Scanner(System.in);
        double principle;
        double rate;
        int timesCompoinded;
        int years;
        double amount;

        System.out.print("Enter the principle amount ");
        principle = sc.nextDouble();

        System.out.print("enter the interest rate: ");
        rate = sc.nextDouble()/100;

        System.out.println("enter the number of times coumpounded per year: ");
        timesCompoinded= sc.nextInt();
        System.out.print("enter the number of years ");
        years = sc.nextInt();

        amount = principle+ Math.pow(1+ rate/timesCompoinded, years*timesCompoinded);
        System.out.printf("the amount that you will pay is %.2f",amount);



        sc.close();
    }
}
