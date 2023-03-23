package Map_PDF1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task4_2With_generic_using_Iterator_COMPANY {

	public Map<Integer,Task4_1generic_EMPLOYEE> designation(){
    	
   	 //set all employee data and add it into the map here
   	 
   	Scanner sc=new Scanner(System.in);
   	Task4_1generic_EMPLOYEE e=new Task4_1generic_EMPLOYEE ();
   	Task4_1generic_EMPLOYEE e1=new Task4_1generic_EMPLOYEE ();
   	  
   	   System.out.println("Enter First Employee Records");
		   System.out.println("----------------------------");
		   System.out.print("  Emp Id = ");
		   e.setEid(sc.nextInt());
		   System.out.print("  Emp Name = ");
		   e.setEname(sc.next());
		   System.out.print("  Emp Salary  = ");
		   e.setEsalary(sc.nextDouble());
   	
        
		   System.out.println(" \n Enter Second Employee Records");
		   System.out.println("----------------------------");
		   System.out.print("  Emp Id = ");
		   e1.setEid(sc.nextInt());
		   System.out.print("  Emp Name = ");
		   e1.setEname(sc.next());
		   System.out.print("  Emp Salary  = ");
		   e1.setEsalary(sc.nextDouble());
		 
		   Map<Integer,Task4_1generic_EMPLOYEE>team=new HashMap();
              team.put(1, e);
              team.put(2, e1);
              
              return team;
    
          }
     public static void main(String args[]){
          //get all employee data using iterator and for each loop here  
   	  
    	 Task4_2With_generic_using_Iterator_COMPANY c=new Task4_2With_generic_using_Iterator_COMPANY();
   	   Map<Integer,Task4_1generic_EMPLOYEE> data=c.designation();
   	   Set<Integer> key=data.keySet();
   	   
   	   Iterator<Integer> itr=key.iterator();
   	   System.out.println(" \n EmpId        EName      Salary");
   	   System.out.println("--------------------------------------");
    	 while(itr.hasNext())
    	   {
    		
    		Integer a=itr.next();
    	Task4_1generic_EMPLOYEE l=data.get(a);
    		
    		System.out.print("  "+l.getEid());
    		System.out.print("         "+l.getEname());
    		System.out.print("         "+l.getEsalary());
    		System.out.println();
    		
			}
			}
     	    }
		    			

