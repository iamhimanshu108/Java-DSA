package strings;

public class maxValue {
    public static void main(String[] args) {
        String[] arr= {"455","747854","-554"};
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int n = Integer.parseInt(arr[i]);
            mx = Math.max(mx,n);
        }
        System.out.println(mx);
    }
}
