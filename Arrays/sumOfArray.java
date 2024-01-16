package Arrays;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {2,5,4,5,3,56,45,78,95,45,50};
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];

        }
        System.out.println(sum);
    }
}
