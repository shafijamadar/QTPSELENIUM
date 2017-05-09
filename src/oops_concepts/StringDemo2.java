package oops_concepts;

public class StringDemo2 {

	public static void main(String[] args) {
		
		equaltest();
		trimTest();
		equalArray();
	}
	
	public static void equaltest(){
		String a="meow";
		String ab=a+"deal";
		String abc="meowdeal";
		
		System.out.println("Meow result is " +ab.equals(abc));
		System.out.println("Result is equal " +ab==abc);
	}
	
	public static void trimTest(){
		
		String stringA=" Wild ";
		String stringB=" Irish ";
		String stringC=" Rose ";
		
		String result1=stringA.trim() + stringB + stringC.trim();
		String result2=stringA.concat(stringB).concat(stringC);
		
		System.out.println("String is "+result1);
		System.out.println("concat result " +result2);
		
	
	}
	
	public static void equalArray(){
		String arr[]={"meow","bray","moo"};
		String a="meow";
		System.out.println("Result of equalArray method is "+arr[0]==a);
	}
	
	
	
	

}
