package BinarySearch;

public class lowerBound {
    public static void main(String[] args) {
        int [] arr = {10,23,46,46,89,91,97,140,264,115};
        int n = arr.length;
        int target = 50;
        int lb = n;
        int lo = 0, hi = n-1;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>=target){ // > kre to Upper Niklega
                lb = Math.min(lb,mid);
                hi = mid-1;

            }
            else lo = mid +1;

        }
        System.out.println(lb);
    }
}
