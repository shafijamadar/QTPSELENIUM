package Module2Assigment;

/*Write a for loop which prints numbers from 1 to 100 but if the number is divisible by 5, 
  then it prints 'divisble by 5 followd by that number'
 */
public class TC003_Divby5 {

	
	public static void main(String[] args) {

		for(int i=100;i>=1;--i){
			
			if(i%5==0){
				
				System.out.println(i+" is divisible by 5");
			}
			else {
				System.out.println(i);	
			}
		}
	}

}
