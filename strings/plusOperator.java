package strings;

import java.util.Scanner;

public class plusOperator {
    public static void main(String[] args) {
        // String s = "abc";
        // String t = "pqr";
        // s = s +10;
        // s  = s +"xyz";
        // System.out.println(s);
        
        
        // System.out.println("abc"+10+20);
        // System.out.println(10+20+"abc");

        //Q- Int into String

        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the First:");
        int n = sc.nextInt();
        // String s = "" + n;
        String s = Integer.toString(n);
        // s += n;
        System.out.println(s);
        System.out.println(s.length());


    }
}
