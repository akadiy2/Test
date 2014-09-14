import java.util.*;


public class Driver {
	
	public static void main (String [] args) {
		
		Map <String, Integer> m1 = new HashMap <String, Integer> ();
		Map <Integer, ArrayList <Integer>> m2 = new HashMap <Integer, ArrayList <Integer>>();
		ArrayList <Integer> list = new ArrayList <Integer> ();
		list.add(4);
		list.add(5);
		list.add(6);
		
		m1.put("Abhi", 8);
		m2.put(8, list);
		
		printMapContents(m1);
		printMapContents(m2);
		
		
		
		
	}
	
	public static <E, T> void printMapContents  (Map <E, T> map) {
		for (E key: map.keySet()) {
			System.out.println(key+"->"+map.get(key));
		}
	}
	
	

}
