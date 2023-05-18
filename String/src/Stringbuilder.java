public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        System.out.println(builder.reverse());

        builder.delete(0, 1);// dlt a
        System.out.println(builder.toString());
    }
}
