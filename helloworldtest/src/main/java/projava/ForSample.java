package projava;

public class ForSample {
	public static void main(String[] args) {
		for (int i = 0; i <= 35; i += 5) {
			System.out.println(i);
		}

		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		for (int j = 0; j < 10; j++) {
			if (3 <= j && j <= 6) {
				System.out.println("skip");
				continue;
			}
			System.out.println(j);
		}
	}
}
