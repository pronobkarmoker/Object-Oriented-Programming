package myPackage;
import java.lang.*;

public class Stringg {

	public static void main(String[] args) {
		String name1= "Bro";
		
		boolean ans = name1.equalsIgnoreCase("shuvo");
		String name = name1.concat("Code");
		System.out.println(ans);
		System.out.println(name);
//		System.out.println(name1.chars());
		name1.trim(); //  remove all empty space
	}

}
