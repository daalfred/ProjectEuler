
//Get sum of digits of n!

import java.math.*;

public class Problem020 {
    static void rechnen(int n){

        BigInteger num = BigInteger.ONE;
        String numstring = "";
        long sum = 0;


        for(long i = n; i > 0; i--)
            num = num.multiply(BigInteger.valueOf(i));

        numstring += num;

        char[] digits = numstring.toCharArray();


        for(int i = 0; i < digits.length; i++)
            sum += Integer.parseInt("" + digits[i]);

        System.out.println(sum);
    }
}
