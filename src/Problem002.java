//Get sum of all even Fibonacchi numbers in I=[1;4000000]

public class Problem002
{
	static void rechnen(){
		System.out.println("Problem 2:");
		
        int sum = 0;
        int i=1;
        int last=1;
        int tmp=0;
        while(i<=4000000){
            if(i%2 == 0)
                sum+=i;

            tmp = i;
            i=i+last;
            last=tmp;

        }
        System.out.println(sum);
    }
}
