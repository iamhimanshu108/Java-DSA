package Arrays;

public class basicSyntax {
    public static void main(String[] args) {
        
        int[] arr = new int[5];
        // initialising individuals elements
        arr[0] = 100;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // output of array elements
        System.out.println(arr[0] + " ");
        // updates
        arr[0] = 99; 
        System.out.println(arr[0]);
        arr[0] += 10; 
        System.out.println(arr[0]);
    }
}
