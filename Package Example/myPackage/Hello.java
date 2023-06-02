package myPackage;

import anotherPackage.Greeting;

public class Hello extends Greeting {
    public static void main(String[] args) {
        System.out.println("package is just like a folder");
        hii(); // static
        Greeting g = new Greeting();
        g.hii();

    }
}
