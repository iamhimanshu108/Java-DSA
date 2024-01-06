package Conditionals.Even_Odd;

import java.util.Scanner;

public class ternery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();

        // Condition  ? if true : if False
        System.out.println((n%2==0) ? "Even" : "Odd");
    }
}
