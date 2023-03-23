package Map_PDF1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task2_2generic_Iterate_Using_Whileloop {
	
	public static void main(String[] args) {

	Map<Integer,String> m=new HashMap<>();
	m.put(1,"abc");
	m.put(2,"pqr");
	m.put(3, "xyz");
	
	Set<Integer> key=m.keySet();
	
	Iterator<Integer> itr=key.iterator();
	while(itr.hasNext())
	{
		Integer k=itr.next();
		System.out.print(k + " ");
		String s=m.get(k);
		System.out.println(s);
	}

}
}
