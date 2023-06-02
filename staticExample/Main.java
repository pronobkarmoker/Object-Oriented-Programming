package staticExample;

public class Main {
    public static void main(String[] args) {
        Human shuvo = new Human(19, "Shuvo karmakar", 10000, false);
        Human pronob = new Human(34, "pronob karmakar", 100000, true);
        Human tonmoy = new Human(17, "tonmoy", 1000, true);

        System.out.println( shuvo.population);
        System.out.println( pronob.population);
        System.out.println( tonmoy.population);

        System.out.println( shuvo.married);
        System.out.println( pronob.married);
        System.out.println( tonmoy.married); //  as static all will be changed as the last .. true true true

        System.out.println( Human.population); // class dye access kora valo
        // without creating object we can use static

        //greeting();// we can not use this method without making this static
        fun(); //  fun er maddhomei greeting call hosse
    }

    static void fun(){
        System.out.println("IT IS FUN");

       //  greeting(); // greeting is not static so we can not use it

        // you cannot access non static stuff without referencing their instances(obj) in a static context
        Main object = new Main(); //  here i am referencing it
        object.greeting();
    }

    void greeting(){
//        fun();
        System.out.println("HELLO SHUVO!!!!");
    }
}
