
/**
 * Write a description of class Problem6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem006
{
    

    static void rechnen(){
    	System.out.println("Problem 6:");
    	
    	int sum_sq = 0;
    	int sq_sum = 0;
    	int diff = 0;
    	
    	
        for(int i = 1; i<=100; i++){
            sq_sum += i*i;

            sum_sq += i;
        }  

        sum_sq = sum_sq*sum_sq;

        diff = sum_sq - sq_sum;

        System.out.println(diff);
    }
}
