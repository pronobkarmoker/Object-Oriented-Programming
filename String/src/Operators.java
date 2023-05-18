import java.util.ArrayList;
public class Operators {
    public static void main(String[] args) {
        System.out.println("shuvo "+ "karmakar"); //concate
        System.out.println('a'+'b');
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        // integer will converted to Integer that will call toString()
        System.out.println("Shuvo"+ new ArrayList<>());
        System.out.println("Shuvo"+new Integer(56));
        System.out.println(new Integer(56) + "" + new ArrayList<>());
    }
}
