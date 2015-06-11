//Get number of all possible paths through a n*n grid

public class Problem015 {
	static void rechnen(int n) {
		long result = 0;
		long[] sum = new long[n];
		long[] tmp = new long[n];

		for (int i = -1; i < (n - 1); i++) {

			if (i == -1)
				result += 1;
			else if (i >= 0) {
				for (int j = 0; j < n; j++) {
					tmp[j] = 1;
				}
				sum = sumUp(tmp, i);

				for (int j = 0; j < n; j++) {
					result += sum[j];
					// System.out.println(sum[j]);
				}
				// System.out.println("->");
			}

			System.out.println(result + "  --  " + i);
			System.out.println("");
		}

		System.out.println("Number of possible Paths: " + (2 * result));
	}

	private static long[] sumUp(long[] sum1, int times) {

		if (times > 0) {

			sum1 = sumUp(sum1, times - 1);

			for (int i = (sum1.length - 1); i >= 0; i--) {
				for (int j = i - 1; j >= 0; j--) {
					sum1[i] += sum1[j];
				}
				System.out.println(sum1[i] + " at " + i + " time: " + times);
			}

		}

		return sum1;
	}
}
