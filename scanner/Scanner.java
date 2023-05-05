package scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scanner {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");

        int num = System.in.read(); // this gives ASCII value
        System.out.println(num); // work for small num
    }
}
