package strings;

public class append {
    public static void main(String[] args) {
       StringBuilder s = new StringBuilder("Abc");
       System.out.println(s);
       s.append(35);
       System.out.println(s);
       s.append('*');
       System.out.println(s);
       s.append("xyz");
       System.out.println(s);
       char[] ch = {'h','i','m','n'};
       s.append(ch);
       System.out.println(s);
    //    int[] arr = {1,2,3,4,5};
    //    s.append(arr); // does not work, addrss is appended
    //    System.out.println(s);

        StringBuilder t = new StringBuilder("pqr");
        System.out.println(t);
    }
}
