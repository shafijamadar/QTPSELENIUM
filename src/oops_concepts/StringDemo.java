package oops_concepts;

public class StringDemo {

	public static void main(String[] args) {
				
		String str="Its very today it will be raining";
		String str1= "This very hot summer";
		
		System.out.println("Finds the length of String is " +str.length());
		System.out.println("Finds the character value at the index 5 is " +str.charAt(5));
		System.out.println("First Occurance of index value at character W is " +str.indexOf('w'));
		System.out.println("Second Occurance of index value at character from W to  " +str.indexOf("t",9 ));
		
		System.out.println("Finds the strings are equal " +str.equals(str1));
		
		System.out.println(str.indexOf('r'));
		
		String a[]=str.split(" ");
		
		for(int i=0;i<a.length;i++){
			
		//	System.out.println(i);
		}
		
		// Converting string to integer
			String x="100";
			
			int i=Integer.parseInt(x);
			
			System.out.println("Converting string to integer "+i);
			
		// Converting int to string
			
			String b=String.valueOf("Converting int to string "+i);
			
			System.out.println(i);
		// Converting string to boolean	
			boolean c=Boolean.valueOf(x);
			
			System.out.println("Converting string to boolean "+c);
			
			
			System.out.println(System.getProperty("user.dir"));
			
		
			
			
	}
	
	
	}


