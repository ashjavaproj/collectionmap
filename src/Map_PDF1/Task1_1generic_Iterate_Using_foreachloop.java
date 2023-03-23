package Map_PDF1;

//Write the Map program, Add this key and value into the map and retrieve using iterator and for each loop.
//(with  generic){aa=abc, bb=pqr, cc=xyz}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Task1_1generic_Iterate_Using_foreachloop {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap();
			m.put("aa","abc");
			m.put("bb","Pqr");
			m.put("cc","xyz");
			Set<String> key=m.keySet();
			
			Iterator<String> itr=key.iterator();
			
			for(String k:key)
			{
				System.out.print(k+"  ");;
				String s=m.get(k);
				System.out.println(s);;
			}
			
	}
	

}


