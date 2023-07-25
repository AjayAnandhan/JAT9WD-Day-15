package Tasks;
import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> obj = new ArrayList<>();
		obj.add("Ajay1");
		obj.add("Ajay2");
		obj.add("Ajay3");
		obj.add("Ajay4");
		obj.add("Ajay5");
		
		String[] obj2 = obj.toArray(new String[0]);
		for (String b : obj2) {
			System.out.println(b);
		}
	}

}