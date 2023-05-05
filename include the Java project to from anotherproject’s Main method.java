/*Exercises:
Write a program in Java to calculate the quotient and remainder after division. Your program will assign two numbers to two variables. Then, the calculated quotient and remainder are assigned to two separate variables. These variables are printed in the console as follows:

The quotient and remainder after the division are ……..

Create another Java project named anotherproject. Now, include the Java project you created in Exercise 1 in the build path of this project and execute it from anotherproject’s Main method.
*/
//code of anotherproject:
package anotherproject;
import exercise1.*;
public class Anotherproject {
    public static void main(String args[]) {
        exerciseone.main(args);
    }
}
// code of excerciseone:

package exercise1;

public class exerciseone {
    public static void main(String args[]) {
        int a = 50 , b = 3;
        int c = a/b;
        int d = a-c*b;
        System.out.println("quotient is " +c +" and remainder is " +d);
    }
}
