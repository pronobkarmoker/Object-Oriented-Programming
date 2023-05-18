import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "shuvo karmakar ";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('h'));
        System.out.println(name.concat("pronob"));
        System.out.println(name.repeat(4));
        System.out.println("      Shuvo    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
