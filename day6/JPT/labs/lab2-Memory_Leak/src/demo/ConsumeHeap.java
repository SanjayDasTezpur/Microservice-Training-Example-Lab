
package demo;

import javax.management.*;
import java.lang.management.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class ConsumeHeap {

	
	
	
	   public static void main(String []args) throws IOException, InterruptedException, MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException{
		  
	       
	
	       
	       HeapManagement account = new HeapManagement();
	       account.display();
	    
	       	     
	      
	 //     account.clear();
	      
	      Thread.sleep(500000000);
	      
	   } 
	   
	   
	
	 
	}