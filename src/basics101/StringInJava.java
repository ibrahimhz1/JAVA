package basics101;

public class StringInJava {
    public static void main(String[] args) {
        String name = "ibrahim";
        char ch = name.charAt(1);
        name = name.concat(" hz");
        System.out.println(ch);
        System.out.println(name);

        StringBuffer sb = new StringBuffer("ibrahim");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" hz");
        System.out.println(sb);

        // Type casting StringBuffer to String
        String s = sb.toString();
        System.out.println(s);
        sb.insert(0, "sdf");
        System.out.println(sb);
        sb.setLength(10);
        System.out.println(sb);
    }
}
