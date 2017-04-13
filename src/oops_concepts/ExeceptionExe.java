package oops_concepts;

public class ExeceptionExe {

	public static void main(String[] args)  {
		
		try{
		int a= divide(4,2);
		System.out.println(a);
		int b= divide(4,0);
		System.out.println(b);
		}catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}

	public static int divide(int a, int b) {
		int result=0;
		try{
		result=a/b;
		}
		catch(Exception e){
			System.out.println("Error 2");
		}
		return result;
	}
}
