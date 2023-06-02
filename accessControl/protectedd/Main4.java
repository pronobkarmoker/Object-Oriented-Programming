package accessControl.protectedd;

import accessControl.publicc.A2;

public class Main4 {
    public static void main(String[] args) {
        A2 a = new A2(10 , "shuvo");

        int n = a.num;
    }
}

//The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
