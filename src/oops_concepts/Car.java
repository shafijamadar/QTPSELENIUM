package oops_concepts;

public class Car {

		public static void main(String[] args){

			try{
			xyz();
			}catch(Exception e)
			{
				System.out.println("Error 1");
				e.printStackTrace();
				e.getMessage();
			}
		}
		
		public static void xyz() throws Exception{
		throw new Exception("Some exception");
		}
	}
