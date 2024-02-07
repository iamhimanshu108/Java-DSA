package basicSorting;

public class insertionSort {
    public static void print(int[] arr) {

        for(int ele : arr){
            System.out.print(ele+" ");

        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10,-4,20,1,-6,8};
        int n = arr.length;
        print(arr);
        // // Insertion  sort
        // for(int i=1; i<n; i++){
        //     int min = Integer.MAX_VALUE;
        //     for(int j=i; j>=1; j--){
        //         if(arr[j]<arr[j-1]){
        //             swap(arr, j, j-1);
    
        //         }else break;
        //     }


        // }

        
        // Insertion  sort
        for(int i=1; i<n; i++){  // n-1 passes
            int j =i;
            while (j>=1 && arr[j]<arr[j-1]) {
                swap(arr, j, j-1);
            }
        }

        print(arr);
    }
}
