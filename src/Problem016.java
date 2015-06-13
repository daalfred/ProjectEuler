//Get the sum of all digits of a^b

import java.math.*;

public class Problem016 {
	static void rechnen(long a, int b){

		long sum = 0;

		BigInteger num = BigInteger.valueOf(a);
		num = num.pow(b);

		String numstring = "" + num;
		char[] digits = numstring.toCharArray();

		for(int i = 0; i < digits.length; i++)
			sum += Integer.parseInt("" + digits[i]);

		System.out.println(sum);
		
	}
}
