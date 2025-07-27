package lab4;

import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal, time, rate = 0.0, interest;

        System.out.println("Enter Principal :");
        principal = sc.nextDouble();

        System.out.println("Enter Time :");
        time = sc.nextDouble();

        if(principal>10000){
           rate = 10.0;
        }
        else if(principal>=10000 || principal<=5000){
            rate=8.0;
        }
        else{
            rate = 5.0;
        }

        interest=(principal*time*rate) / 100;
        System.out.println("The Simple Interest is "+ interest);
    }
}