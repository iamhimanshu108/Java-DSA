package TwoDimensionalArray;

public class forEach {
    public static void main(String[] args) {
        int[] a = {4,7,2,8};
        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
        // 1 2 3
        // 4 5 6  
        int[][] b ={{1,2,3},{4,5,6}};
        for(int[] ele : b){
            for(int x : ele){
                System.out.println(x+" ");
            }
            System.out.println();
        }
    } 
}
