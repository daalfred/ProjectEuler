//Get largest palendrom product a * b with a, b ∊ [0;1000[ 

public class Problem004 {
	static void rechnen() {
		System.out.println("Problem 4:");

		int num = 0;
		int tmp = 0;

		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				tmp = i * j;
				if ((tmp > num)
						&& (tmp == Integer.parseInt(new StringBuffer(String
								.valueOf(tmp)).reverse().toString()))) {
					num = tmp;
					System.out.println(num);
				}
			}
		}
	}
}
