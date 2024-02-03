package strings;

public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb  =new StringBuilder("Abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        sb.delete(2,6);
        System.out.println(sb);
        sb.insert(2,  true);
        System.out.println(sb);

    }
}
