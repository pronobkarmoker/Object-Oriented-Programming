package encapsulation;

public class Main {
    public static void main(String[] args) {
        Human obj = new Human();
         obj.setAge(21);
         obj.setName("shuvo");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
