//Get Primefactors of num

public class Problem003 {
	static void rechnen(long num) {
		boolean solved = false;
		long prod = 1;
		long prime = 2;
		long i = num;
		int pow = 0;

		while ((!solved) && (prime < (i + 1))) {
			if (i % prime == 0) {
				while (i % prime == 0) {
					i = i / prime;
					prod *= prime;
					pow++;
				}
				System.out.println("--" + prime + "^" + pow + "--");
			}

			prime++;
			pow = 0;

			if (prod == num)
				solved = true;
		}

	}
}
