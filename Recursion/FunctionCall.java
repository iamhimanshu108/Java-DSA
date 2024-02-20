package Recursion;

public class FunctionCall {
    public static void mango(){
        System.out.println("Hi, I am in mango");

    }
    public static void banana(){
        mango();
        System.out.println("Hi, I am in banana");
    }
    public static void apple(){
        banana();
        System.out.println("Hi, I am in Apple");
    }
    public static void main(String[] args) {
        apple();
        System.out.println("Hi, I am in main Method");

    }
}
