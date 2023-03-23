package Map_PDF1;

import java.util.HashMap;
import java.util.Map;

public class Task1_3generic_Using_EntryKV {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap();
			m.put("aa","abc");
			m.put("bb","Pqr");
			m.put("cc","xyz");
			for(Map.Entry<String,String>x: m.entrySet())
			{
						System.out.println(x.getKey()+ " "+x.getValue());
			}
			
	}
	

}




