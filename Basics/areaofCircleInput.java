package Basics;

import java.util.Scanner;

public class areaofCircleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius : ");
        double r = sc.nextDouble();
        double a = 3.14*r*r;
        System.out.println(a);
    }
}
