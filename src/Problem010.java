//Get sum of all primes in I=[0;limit[

public class Problem010 {
	static void rechnen(int limit){
		long sum = 0;
		
		double percent = 0;
		
		if(limit < 3)
			return;
		
		int primes[] = {2};
		boolean isPrime = false;
		
		
		
		for(int i = 3; i < limit; i+=2){
			
			
			isPrime = true;
			for(int j = 0; j < primes.length; j++){
				if(i % primes[j] == 0)
					isPrime = false;
			}
			
			if(isPrime){
				
				primes = Methods.addToIntArray(primes, i);
			}
			
			System.out.println(i);
		}
		
		
		
		for(int i = 0; i < primes.length; i++){
			System.out.print("-" + primes[i] + "-");
			
			sum+=primes[i];
		}
		
		System.out.println();
		System.out.println(sum);
	}
}
