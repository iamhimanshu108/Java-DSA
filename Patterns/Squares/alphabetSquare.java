package Patterns.Squares;

import java.util.Scanner;

public class alphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your n: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) { //rows
            for(int j=1; j<=n;j++){ //cols
                System.out.print((char)(j+64) +" ");
            }
            System.out.println();
        }
    }
}
