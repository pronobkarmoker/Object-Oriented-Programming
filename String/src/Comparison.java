public class Comparison {
    public static void main(String[] args) {
        String a = "shuvo";
        String b = "shuvo"; //String pool (==)
        // ==
        System.out.println(a==b);


        // create different obj
        String c = new String("shuvo");
        String d = new String("shuvo");
        System.out.println(c==d);

        // .equals cheack the value only
        System.out.println(c.equals(d));

        System.out.println(c.charAt(0));

    }
}
