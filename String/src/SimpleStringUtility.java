package myPackage;

public class SimpleStringUtility {

	public static void main(String[] args) {
		String str = "I,am,studying,software,engineering,in,DU";
		String demarcation =",";
		
		int start = 0 , end;
		end = str.indexOf(demarcation, start);
		
		while(end != -1) {
			String parts = str.substring(start, end);
			System.out.println(parts);
			
			start = end +1;
			end = str.indexOf(demarcation, start);
		}
		
		String parts = str.substring(start);
		System.out.println(parts);

	}

}
