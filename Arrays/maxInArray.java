package Arrays;

public class maxInArray {
    public static void main(String[] args) {
        // int[] arr = {10,8,87,56,63,12,45,78,6,2,96,56,144};
        // int n = arr.length;
        // int mx = arr[0];
        // for(int i =1; i<n; i++){
        //     if(arr[i]>mx) mx = arr[i];

        // }
        // System.out.println(mx);



        int[] arr = {-10,-8,-87,-56,-63,-12,-45,-78,6,-2,-96,-56,-144};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i =1; i<n; i++){
           // if(arr[i]>mx) mx = arr[i];
            mx = Math.max(mx,arr[i]);
        }
        // second Max
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            if(arr[i] != mx)
                smx = Math.max(smx, arr[i]);
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}
