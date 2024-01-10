package Patterns.Squares;

import java.util.Scanner;

public class starSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your m: ");
        int m = sc.nextInt();
        // int n = sc.nextInt();
        for (int i = 1; i <=m; i++) { //rows
            for(int j=1; j<=m;j++){ //cols
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
