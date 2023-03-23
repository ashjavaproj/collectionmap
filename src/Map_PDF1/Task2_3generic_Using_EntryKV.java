package Map_PDF1;
//Write the Map program, Add this key and value into the map and retrieve using for each loop .
//(without generic){1=abc, 2=pqr, 3=xyz}

import java.util.HashMap;
import java.util.Map;

public class Task2_3generic_Using_EntryKV {

	public static void main(String[] args) {

		Map<Integer,String> m=new HashMap<>();
		m.put(1,"abc");
		m.put(2,"pqr");
		m.put(3, "xyz");
		
		for(Map.Entry<Integer, String> x:m.entrySet())
		{
			System.out.println(x.getKey()+" "+x.getValue());
			
		}
		}
		}	
