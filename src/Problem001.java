//Get sum of all multiples of 3 or 5 in I=[0;1000[

public class Problem001
{
    static void rechnen(){
    	System.out.println("Problem 1:");
    	
        int sum = 0;

        for(int i = 0; i < 1000; i++){
            if((i % 3 == 0) || (i % 5 == 0)){
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}
