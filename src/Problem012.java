//Get smallest triangle number with divs divisors

public class Problem012 {
	static void rechnen(int divs) {
		int sum = 0;
		int n = divs * divs;
		int tmpdivs = 0;

		for (int i = 0; i <= n; i++) {
			sum += i;
			tmpdivs = Methods.getNoOfDivs((long) sum);

			System.out.println(sum + " -> " + tmpdivs + " Divisors");

			if (Methods.getNoOfDivs((long) sum) >= divs) {
				System.out.println("---" + sum + "---");
				return;
			}
		}
	}
}
