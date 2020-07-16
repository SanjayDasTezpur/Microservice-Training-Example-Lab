package demo;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class TestClientStrong {

	public static void main(String[] args) {
		
		String s1 = new String("God is great");
		
		String s2 = s1;
		
		//WeakReference<String> s3 = new WeakReference<String>(s1);
		
	   // SoftReference<String> s4 = new SoftReference<String>(s1);
	    
		
		System.out.println("Before, s1 value is :"+s1);
		
		System.out.println("Before, s2 value is :"+s2);
		
          System.out.println("Before, s1 address  is :"+s1.hashCode());
		
		System.out.println("Before, s2 address is :"+s2.hashCode());
		
		s1=null;
		System.gc();
		
		
		System.out.println("After, s1 value is :"+s1);
		
		System.out.println("After, s2 value is :"+s2);
		
		System.out.println("Before, s2 address is :"+s2.hashCode());
		
	     System.out.println("Before, s1 address  is :"+s1.hashCode());
			
		
		
		

	}

}
