package oops_concepts;

public class A {
	
	public static void main(String args[]){

		/*int o[] = new int[2];
		o[2]=10;
*/
		try{
			int o[] = new int[2];
			o[3]=23;
			o[1]=20;
			}catch(Exception e){
				System.out.println("The message is" +e.getMessage());
			e.printStackTrace();
			}
		finally{
			System.out.println("2nd post ");
		}	
	}
}

			




