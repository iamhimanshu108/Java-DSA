package Conditionals;

import java.util.Scanner;

public class greatestOfThreeNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c)System.out.println(a+ " is Largest");

            else  // c>a>b
                System.out.println(c+ "is largest");
        }
        else{ //b>a
            if(b > c)System.out.println(b+ "is largest");
            else    //c>b>a
                System.out.println(c+ " is largest");
        }
    }
}
