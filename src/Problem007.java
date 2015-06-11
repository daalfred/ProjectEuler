//Get n-th prime number

public class Problem007 {
	static void rechnen(int n) {
		boolean[] noprime = new boolean[n * n];
		noprime[0] = true;
		noprime[1] = true;
		int num = 1;

		for (int i = 2; i < noprime.length; i++) {
			if (!noprime[i]) {
				for (int j = 0; j < noprime.length; j++) {
					if (j % i == 0)
						noprime[j] = true;
				}

				System.out.println(num + ". " + i);

				if (num == n) {
					System.out.println(num + ". prime: " + i);
					// return;
				}
				num++;
			}
		}

	}
}
