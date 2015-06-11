//Get largest Collatz sequence starting in I=[0;limit[

public class Problem014 {
	static void rechnen(long limit){
		int maxcnt = 0;
		long maxnum = 0;
		int cnt = 0;
		long num = 0;
		
		for(long i = 3; i < limit; i += 2){
			
			cnt = 0;
			
			num = i;
			
			while(num != 1){
				
				//System.out.println(num + " -> ");
				
				if(num % 2 == 0)
					num = num / 2;
				else
					num = (3 * num) + 1;
				
				cnt++;
				
			}
				
			System.out.println(i + " --- Steps: " + cnt);
			
			if(cnt > maxcnt){
				maxcnt = cnt;
				maxnum = i;
			}
		}
		
		System.out.println("Max: " + maxcnt + " at " + maxnum);
	}
}
