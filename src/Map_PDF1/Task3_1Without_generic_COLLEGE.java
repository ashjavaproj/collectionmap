package Map_PDF1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Task3_1Without_generic_COLLEGE {

	 public void m1(){
		 //set all student data and add it into the map here using Entry(K,V) without returning value
		 Scanner sc=new Scanner(System.in);
		  Task3_1generic_Student st=new Task3_1generic_Student(); 
		 
		   System.out.println("Enter Student Records");
		   System.out.println("----------------------------");
		   System.out.print(" Rollno = ");
		   st.setRollno(sc.nextInt());
		   System.out.print(" Name = ");
		   st.setName(sc.next());
		  
	     
	       Map<Integer,String> eng=new HashMap();
	       eng.put(st.getRollno(),st.getName());
	       for(Map.Entry<Integer,String> e : eng.entrySet())
	       {
	    	   System.out.println(e.getKey()+"  =  "+e.getValue());
	    	  
	       }
	       
	 	   }
	       public static void main(String args[])
	       
	       {
	    	   Task3_1Without_generic_COLLEGE cl=new Task3_1Without_generic_COLLEGE();  
	    	   cl.m1();
	    	   
	       }
	 	   }	
	       
	 
	 
	 
	  