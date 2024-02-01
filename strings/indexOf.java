package strings;

public class indexOf {
    public static void main(String[] args) {
        String s = "Himanshu Yadav";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));

        System.out.println();
        String a = "abcd";
        String b = "abc";
        System.out.println(a.compareTo(b));

        System.out.println();

        String c  = "Hello Himanshu Kya hal hai";
        System.out.println(c.contains("anshu"));
        System.out.println(c.startsWith("ha"));
        System.out.println(c.endsWith("hai"));
    }
}
