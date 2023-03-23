package Map_Classwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo_MAP_LIST_STring {

	public static void main(String[] args) {
		
		List<String> mh=new ArrayList();
		mh.add("pune");
		mh.add("Mumbai");
		 
		List<String> gj=new ArrayList();
		gj.add("Surat");
		gj.add("ahemdabad");
		
		Map<String,List<String>> India=new HashMap();
		India.put("MH",mh);
		India.put("GJ",gj);
		
		Set<String> keys=India.keySet();
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			List<String> l=India.get(key);
			Iterator<String> itr1=l.iterator();
			while(itr1.hasNext())
			{
				String s=itr1.next();
				System.out.println(s);
			}
			}
			}
			}
