package Patterns.special_patterns;

import java.util.Scanner;

public class starCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your n: ");
        int n = sc.nextInt();
        

        for (int i = 1; i <=n; i++) { //rows
            for(int j=1; j<=n;j++){ //cols
                if(i==j  || i+j==n+1)
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");

            }
            System.out.println();
        }
    }
}
