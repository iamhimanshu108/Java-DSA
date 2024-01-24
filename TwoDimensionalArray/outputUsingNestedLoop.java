package TwoDimensionalArray;

import java.util.Scanner;

public class outputUsingNestedLoop {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        Scanner sc = new Scanner(System.in);

        int m = arr.length; // No of Rows
        int n = arr[0].length; // No of Cols
        System.out.println(n);
        
        
        // input of 2D Array
        for(int i=0; i<2;i++){ // rows
            for(int j=0;j<3; j++){ // cols
                arr[i][j] = sc.nextInt();
            }
        }


        // output of 2D Array
        // for(int i=0; i<3;i++){ // rows
        //     for(int j=0;j<3; j++){ // cols
        //         System.out.print(arr[i][j]+" ");
        //     }
        // }
        // System.out.println();
 
        // output using forEach Loop
        // for(int ele : arr){

        // }

    }
}
