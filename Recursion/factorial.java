package Recursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==1) return 1;  // base case
        return n * fact(n-1); //call

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
