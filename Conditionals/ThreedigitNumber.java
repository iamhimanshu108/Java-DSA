// Q:- Take positive integer input and tell if it ia a three digit nmber or not.

package Conditionals;

import java.util.Scanner;

public class ThreedigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price : ");
        int n = sc.nextInt();

        if(99<n && n<1000)System.out.println("3 Digit Number");
        else System.out.println("Not a 3 digit Number");
    }
}
