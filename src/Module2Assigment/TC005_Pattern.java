package Module2Assigment;

public class TC005_Pattern {

	/*Write program to display following output

		1
		12
		1234
		12345
		123456
		123456 */
	
	public static void main(String[] args) {
		
	
		int i=0;
		int j=0;
		for(i=1;i<=10;i++){
			
			for(j=1;j<=i-1;j++){
				
				System.out.print("");
			}
			for(int k=1;k<=i;k++){
				
			System.out.print(" " +k + " ");
		}
		System.out.println();
		}
	}

}
