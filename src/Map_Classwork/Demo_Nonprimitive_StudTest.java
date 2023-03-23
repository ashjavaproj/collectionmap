package Map_Classwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo_Nonprimitive_StudTest {

	public static void main(String[] args) {

		Demo_Nonprimitive_Student st=new Demo_Nonprimitive_Student();
		st.setRollno(101);
		st.setName("Manasvi");
		
		Map<Integer,Demo_Nonprimitive_Student> m=new HashMap();
		m.put(1,st);
		
		Set<Integer> keys=m.keySet();
		
		System.out.println("    Rollno        Name  ");
		System.out.println("------------------------------");
		for(int key:keys)
		{
			Demo_Nonprimitive_Student stu=m.get(key);
			System.out.print("     "+stu.getRollno());
			System.out.println("         "+stu.getName());
		}

	}

}
