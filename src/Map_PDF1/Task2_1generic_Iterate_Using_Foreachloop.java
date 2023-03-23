package Map_PDF1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Write the Map program, Add this key and value into the map and retrieve using for each loop .
//(with generic){1=abc, 2=pqr, 3=xyz}

public class Task2_1generic_Iterate_Using_Foreachloop {

		public static void main(String[] args) {

			Map<Integer,String> m=new HashMap<>();
			m.put(1,"abc");
			m.put(2,"pqr");
			m.put(3, "xyz");
			
			Set<Integer> key=m.keySet();
			
			Iterator<Integer> itr=key.iterator();
			
			
			for(Integer k:key)
				
			{
				System.out.print(k + " ");
				String s=m.get(k);
				System.out.println(s);
				
			}
			}
			}	


	
