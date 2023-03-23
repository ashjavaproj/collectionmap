package Map_PDF1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Write the Map program, Add this key and value into the map and retrieve using iterator and for each loop.
//( without generic){aa=abc, bb=pqr, cc=xyz}


public class Task1_2generic_Iterate_Using_Whileloop {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap();
			m.put("aa","abc");
			m.put("bb","Pqr");
			m.put("cc","xyz");
		Set<String> key=m.keySet();
		
		Iterator<String> itr=key.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.print(s+" = ");
			String s1=m.get(s);
			System.out.println(s1);
		}
			
			/*for(Map.Entry<String, String> x:m.entrySet())	
			{
				System.out.println(x.getKey()+" "+x.getValue());
			}*/
			}
			}
