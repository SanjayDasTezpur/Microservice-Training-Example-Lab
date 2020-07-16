package demo;

public class Test {

	public static void main(String args[])
	{
		String a = new String("great");
		String b = a;
		
		System.out.println("value "+ a.hashCode());
		System.out.println("value "+ b.hashCode());
		
		a=null;
		
		System.gc();
		
		System.out.println("value "+ b.hashCode());
		System.out.println("value "+ a);
	
		
	}
}

