//Get Pythagorean triplet with a + b + c = sum


public class Problem009 {
	static void rechnen(int sum){
		System.out.println("Problem 9:");
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		int prod = 0;
		
		for(int i = 1; i <= (sum / 2); i++){
			a = i;
			
			for(int j = 1; j <= (sum / 2); j++){
				b = j;
				
				c = sum - a - b;
				
				if((a * a) + (b * b) == (c * c)){
					prod = a * b * c;
					System.out.println("a = " + a + " , b = " + b + " , c = " + c + " , a * b * c = " + prod);
					return;
				}
					
			}
		}
		
	}
}
