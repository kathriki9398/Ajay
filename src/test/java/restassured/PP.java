package restassured;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PP {

	
		
		
	 public static void main(String[] args) {
	        String str = "is Nic Pooran, but even his smooth ball-striking skills aren't quite working on this slow Lucknow pitch. He's 4off . Is there a chance for MI to squeeze this game? Hardik thinks so. He's gone for a big gamble, bowling out Bumrah in the th over.";

	        String a[]=str.split(" ");
	        
	        
	        Map<String, Integer>map=new HashMap<String, Integer>();
	        
	        
	        for(String c:a) {
	        
	        	c=c.toLowerCase();
	        	
	        	if(map.containsKey(c)) {
	        		
	        		map.put(c, map.get(c)+1);
	        		
	        		
	        	}else {
	        		map.put(c, 1);
	        	}
	        	
	        }
	 System.out.println(map);
	
	 StringBuffer sb = new StringBuffer();
	 
	 for(String c:map) {
		 
	 }
	 
	        
	        
	        }

}
