package Com.Conditional;

public class Conditionals {
	
	
	
	
	// if is used ton check half condition 
	void If() {
		
		int jay = 22;
		int veeru = 23;
			
		if(jay>veeru) {
			System.out.println("jay will pay");
		}
	}
		
		
	void ifElse() {
		
		int jay = 22;
		int veeru = 23;
		
		if(jay>veeru) {
			System.out.println("jay will pay ");
		}
		else {
			
			System.out.println("veeru will pay ");
			
		}
				
		
	}
	
	
	void elseIf() {
		
		int jay = 24 ;
		int veeru = 24;
		
		
		if(jay>veeru) {
			System.out.println("jay will pay ");
		}
		else if (veeru > jay) {
			
			System.out.println("veeru will pay ");
			
		}
	
	    else {
	    	
	    	System.out.println("biil split");
		
	    }
		
	}
	
	
	// switch statement is rarely used because We Cannot use mutiple variable and its type in it ;
	
	
	void switchConditional() {
		
		int var = 5;
		
		switch(var){
		
		
		case 1:
		         System.out.println(1111);
		         break;
		case 2:
		         System.out.println(1111);
		         break;
		        	 
		case 3:
		         System.out.println(1111);
		         break;
		
		default :
		         System.out.println("");
      
		
		
		
		
		
		
		
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	
}
