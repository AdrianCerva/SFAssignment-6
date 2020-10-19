import java.lang.*;
import acm.program.*;
import java.util.HashMap;


public class NameCounts extends ConsoleProgram  {
	 int currentCount = 0;
	 String name = " ";
	public void run() {
       HashMap<String, Integer> duplicates = new HashMap<>();
       
       while(true) {
    	   String name = readLine("Enter name: ");
    	   if(name.equals(""))break;
    	   if(duplicates.containsKey(name));{
    		   
    		   currentCount++;
    	  
    	      
    	      duplicates.put(name, currentCount);
    	   }
    	   
    	   
       }
//	  println(duplicates.getkey() + " " + duplicates.getValue());
       for(String i : duplicates.keySet()) {
    	   print("Entry [" + i + "] has count " + duplicates.get(i) + "\n");
          }
    	 
    	  
      
       
	}
}
