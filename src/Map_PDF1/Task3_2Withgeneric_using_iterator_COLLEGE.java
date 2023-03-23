package Map_PDF1;

//set all student data and add it into the map here Iterate using While loop with returning value

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task3_2Withgeneric_using_iterator_COLLEGE {
	public Map<Integer, Task3_1generic_Student> m1(){
		 //set all student data and add it into the map here
		 Scanner sc=new Scanner(System.in);
		 Task3_1generic_Student st=new Task3_1generic_Student();
		 Task3_1generic_Student st1=new Task3_1generic_Student();
		 
		   System.out.println("Enter First Student Records");
		   System.out.println("----------------------------");
		   System.out.print(" Rollno = ");
		   st.setRollno(sc.nextInt());
		   System.out.print(" Name = ");
		   st.setName(sc.next());
		  
		   System.out.println("Enter Second Student Records");
		   System.out.println("----------------------------");
		   System.out.print(" Rollno = ");
		   st1.setRollno(sc.nextInt());
		   System.out.print(" Name = ");
		   st1.setName(sc.next());
		  
	     
		   Map<Integer,Task3_1generic_Student> eng=new HashMap();
	       eng.put(1,st);
	       eng.put(2,st1);
	       return eng;
	        }
	 
     
 public static void main(String args[]){
       //get all student data using iterator and for each loop here
	 Task3_2Withgeneric_using_iterator_COLLEGE cl=new Task3_2Withgeneric_using_iterator_COLLEGE();
	   Map<Integer,Task3_1generic_Student> data=cl.m1();
	   
	   Set<Integer> key=data.keySet();
	   Iterator<Integer> itr=key.iterator();
	   while(itr.hasNext())
	   {
		   Integer k=itr.next();
		   Task3_1generic_Student s=data.get(k);
		   System.out.print("  "+s.getRollno());
		   System.out.println("   "+s.getName());

	   }
	   
	  
}
}
