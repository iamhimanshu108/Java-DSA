package Arrays;

public class rollNumber {
    public static void main(String[] args) {
        int[] arr = {81,45,67,12,34,56,24,100};
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i]<35)
                System.out.println(i+" "+arr[i]);
        }
    }
}
