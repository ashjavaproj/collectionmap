package Map_Classwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_Through_Set {
	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap();
		m.put(1,"java");
		m.put(2,"python");
		m.put(3,"cloud");
		//System.out.println(m);//{1=java, 2=python, 3=cloud}
		
		Set<Integer> keys=m.keySet();
		//System.out.println(keys);//[1, 2, 3]
		
		for(int key :keys)
		{
			//System.out.println(key);//1 2 3
			String s=m.get(key);
			System.out.println(s);
		}
	}
}
