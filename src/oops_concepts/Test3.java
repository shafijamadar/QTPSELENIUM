package oops_concepts;

public class Test3 {
	
		public static void main(String[] args) {
		A1 obj=null;
		try{
		obj.parent();
		System.out.println("success");
		}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
		}

		}
		}


