// Q:- Take positive integer input and tell if it is divisible by  5 or 10

package Conditionals;

import java.util.Scanner;

public class FiveandThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();

        if(n%5 == 0 || n%10 == 0 )System.out.println("Divisble by 5 or 10");
        else System.out.println("Not Divisible by 5 or 10");
    }
    
}
