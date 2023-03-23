package Map_Classwork;

import java.util.HashMap;
import java.util.Map;

public class Demo_Through_Entry {

	public static void main(String[] args) {

Map<Integer,String> m=new HashMap<>();
m.put(1,"Sandeep");
m.put(2,"Abhi");
m.put(3, "Gauri");
m.put(4,"Ashwinee");
m.put(5, "Nikita");
//System.out.println(m);{1=Sandeep, 2=Abhi, 3=Gauri, 4=Ashwinee, 5=Nikita}
//System.out.println(m.get(1));//Sandeep
for(Map.Entry<Integer, String> x:m.entrySet())
{
	System.out.println(x.getKey()+" "+x.getValue());
	
}
}
}	
