package Arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n  = arr.length;

        for(int ele : arr){
            System.out.println(ele+" ");
        }
        System.out.println();
        // reverse
        // for(int i = 0 ; i<n/2; i++){
        //     int j = n-1-i;
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = arr[i];
        // }
        // for(int ele: arr){
        //     System.out.println(ele+" ");

        // }System.out.println();

        // Method 2
        // int i =0, j = n-1;
        // while (i<=j) {
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;

        // }
        // for(int ele: arr){
        //     System.out.println(ele+" ");

        // }System.out.println();

        // swap

        int i =0, j = n-1;
        while (i<=j) {
            swap(arr,i,j);
            i++;
            j--;

        }
        for(int ele: arr){
            System.out.println(ele+" ");

        }System.out.println();
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
