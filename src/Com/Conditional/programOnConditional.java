package Com.Conditional;

public class programOnConditional {
	
	
// Wap to check Positive or negative num ;

	void CheckPositive(int num ){
		
	
		if(num >= 0) {
			
			System.out.println("positive number ");
			
			
		}
		else {
			System.out.println("negative number ");
		}
		
		
		
	}
	
// wap to check even odd number ;
	
	
	
	void checkEvenOdd(int num ) {
		
		if(num%2 == 0) {
			
			System.out.println("even number ");
		}
		else {
			System.out.println("odd number");
		}
		
	}
	
	
//you have given a number
//	-> if the number is divisible by 3 display "FIZZ"
//	> if the number is divisible by 5 display "BUZZ"
//	if the number is divisible by 3&5 both display "FIZZ BUZZ"	
	

	void checkDivisibility(int num) {
		
		if((num%3==0)&&(num%5==0)) {
						
			System.out.println("FIZZ BUZZ");
							
		}
		
		else if(num%3==0) {
			
			System.out.println("FIZZ");
			
		}
		
	    else if(num%5==0) {
			
			System.out.println("BUZZ");
			
		}
		else{
			
			System.out.println("GO home ");
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
