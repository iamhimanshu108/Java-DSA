package basicSorting;

public class checkifArrayIsSortedOrNot {
    public static void main(String[] args) {
        // int[] arr = {1,7,3,8,9,12};
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        boolean flag = true; // true means sorted
        for(int i = 0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag==true) System.out.println("Sorted");
        else System.out.println("Unsorted");
    }
}
