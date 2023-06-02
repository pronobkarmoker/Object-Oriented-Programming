package staticExample;

public class InnerClass { // outside cls cant be static
    static class Test { //inner class can be static
        static String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a =  new Test("shuvo");
        Test b =  new Test("pronob");

        System.out.println(a.name);
        System.out.println(b.name);
        // static class Test {
        //  ..... }
        // it dose not depend on object , so now print shuvo then pronob;;;


        //static String name;
        // it will cng the name ,  output pronob  pronob
    }
}
