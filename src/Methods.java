public class Methods {
	static int[] addToIntArray(int[] array, int num) {
		int[] newArray = new int[array.length + 1];

		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}

		newArray[array.length] = num;

		return newArray;

	}

	static boolean[] extendBooleanArray(boolean[] array) {
		boolean[] newArray = new boolean[array.length * array.length];

		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}

		return newArray;

	}

	static int getNoOfDivs(long num) {
		int[] pfpws = Methods.getPrimeFactorPowers(num);
		int noOfDivs = 1;

		for (int i = 0; i < pfpws.length; i++)
			noOfDivs *= (pfpws[i] + 1);

		return noOfDivs;
	}

	static int[] getPrimeFactors(long num) {

		boolean solved = false;
		long prod = 1;
		long prime = 2;
		long i = num;
		int pow = 0;
		int[] primefactors = new int[0];

		while ((!solved) && (prime < (i + 1))) {
			if (i % prime == 0) {
				while (i % prime == 0) {
					i = i / prime;
					prod *= prime;
					pow++;
				}

				primefactors = Methods.addToIntArray(primefactors, (int) prime);
			}

			prime++;
			pow = 0;

			if (prod == num)
				solved = true;
		}

		return primefactors;

	}

	static int[] getPrimeFactorPowers(long num) {

		boolean solved = false;
		long prod = 1;
		long prime = 2;
		long i = num;
		int pow = 0;
		int[] primefactorpows = new int[0];

		while ((!solved) && (prime < (i + 1))) {
			if (i % prime == 0) {
				while (i % prime == 0) {
					i = i / prime;
					prod *= prime;
					pow++;
				}

				primefactorpows = Methods.addToIntArray(primefactorpows, pow);
			}

			prime++;
			pow = 0;

			if (prod == num)
				solved = true;
		}

		return primefactorpows;

	}

	static int getNoOfPrimeFactors(long num) {

		boolean solved = false;
		long prod = 1;
		long prime = 2;
		long i = num;
		int pow = 0;
		int nopfs = 0;

		while ((!solved) && (prime < (i + 1))) {
			if (i % prime == 0) {
				while (i % prime == 0) {
					i = i / prime;
					prod *= prime;
				}

				nopfs++;
			}

			prime++;
			pow = 0;

			if (prod == num)
				solved = true;
		}

		return nopfs;

	}
}
