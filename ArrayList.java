import java.util.ArrayList;
import java.util.Collections;


public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		
		//add
		list.add(0);
		list.add(3);
		
		System.out.println(list);
		
		//get
		
		int element = list.get(1);
		System.out.println(element);
		
		//add element in between
		list.add(1,5);
		System.out.println(list);
		
		//set
		list.set(0,9);
		System.out.println(list);
		
		//remove
		list.remove(0);
		System.out.println(list);
		
		//size
		int size = list.size();
		System.out.println(size);
		
		//Loop
		for(int i =0 ; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		
		System.out.println();
		
		//sorting
		Collections.sort(list);
		System.out.println(list);
		
	}

}
