package Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] nums = arr; // shallow Copy
        nums[0] = 70;
        System.out.println(arr[0]);
        // int[] brr = Arrays.copyOf(arr, arr.length);
        // for(int ele : brr){
        //     System.out.println(ele+" ");
        // }

        // for(int i=0; i<nums.length; i++){
        //     System.out.print(nums[i]+" ");
        // }
    }
}
