package Tasks;

import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Ajay1");
		obj.add("Ajay2");
		obj.add("Ajay3");
		obj.add("Ajay4");
		obj.add("Ajay5");
		
		System.out.println("Original ArrayList :");
		for (String a : obj) {
			System.out.println(a);
		}
		System.out.println();
		obj.clear();
		
		System.out.println("After removed the elements :");
		for(String b : obj) {
			System.out.println(b);
		}
		
	}

}
