package staticExample;
class Test {
    static String name;

    public Test(String name) {
        Test.name = name;
    }
}
public class StaticNamePrint {

        public static void main(String[] args) {
            Test a = new Test("shuvo");
            Test b = new Test("pronob");

            System.out.println(a.name);
            System.out.println(b.name); // both will pronob bcz static


    }
}
