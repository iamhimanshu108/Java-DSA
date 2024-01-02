package Conditionals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price : ");
        int cp = sc.nextInt();
        System.out.print("Enter sell Price : ");
        int sp = sc.nextInt();

        if(sp > cp){
            System.out.print("Profit is ");
            System.out.println(sp-cp);
        } 
        if(cp > sp) System.out.println("Loss is " +(cp-sp));
        if(cp == sp) System.out.println("Kam Chal Gya");
    }
}
