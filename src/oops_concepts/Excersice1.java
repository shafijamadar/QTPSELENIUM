package oops_concepts;

public class Excersice1 {
	
		public static void main(String[] args) {

		A1 a = new A1();
		B1 b = new B1();
	
		System.out.println(a.x);
	//	System.out.println(a.y); // We cannot call variable of child class with reference of parent class
		System.out.println(b.x);
		System.out.println(b.y);

		a.parent();
	//  a.child();    // We cannot call method of child class with reference of parent class
		b.parent();
		b.child();
		}

		}

		class A1{

		String x="Parent";
		
		public void parent(){
			System.out.println("Parent class called");
		}
		}

		class B1 extends A1{
		String y="Child";

		public void child(){
			System.out.println("Child class called");
		}
		}