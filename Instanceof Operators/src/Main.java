public class Main {
    public static void main(String[] args) {
        Vehicle a= new Car();
        boolean result = a instanceof Car;
        boolean result2 = a instanceof Vehicle;
        System.out.println(result);
        System.out.println(result2);

    }
}