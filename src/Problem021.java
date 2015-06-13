
//Get sum of all amicable numbers under limit

public class Problem021 {
    static void rechnen(int limit){
        long sum = 0;
        long j = 0;

        for (long i = 1; i < limit ; i++) {
            j = Methods.getSumOfDivs(i);
            System.out.println(i + " Sum of Divs: " + j);
            if((j != i) && i == Methods.getSumOfDivs(j))
                sum += i;
        }

        System.out.println(sum);

    }
}
