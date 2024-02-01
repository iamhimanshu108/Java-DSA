package strings;

public class substring {
    public static void main(String[] args) {
        String s = "abcde";
        // System.out.println(s.substring(3)); // print 3 and age wale indexes.
        // System.out.println(s.substring(1,4));
        // System.out.println(s.substring(2,3));

        // print all SubStrings
        for(int i=1; i<s.length(); i++){
            for (int j =i+1; j <=5; j++) {
                
                System.out.println(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
