import java.util.*;
public class Practice {
	
	public static void main (String [] args) {
		int nbr = 324;
		ArrayList <Integer> l = primesBeforeNbr(nbr);
		System.out.println(l);
		
		
	}
	
	public static ArrayList <Integer> primesBeforeNbr(int n) {
		ArrayList <Integer> list = new ArrayList <Integer> ();
		
		while (n >= 2) {
			if (isPrime(n)) {
				list.add(n);
			}
			
			n--;
		}
		return list;
	}
	
	public static boolean isPrime(int n) {
		if (n%2==0) return false;
		for (int ind = 3; ind*ind<=n; ind+=2) {
			if (n%ind==0) {
				return false;
			}
		}
		return true;
	}
	
	
	

}
