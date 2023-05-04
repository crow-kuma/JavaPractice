package projava;

public class LoopStepSample {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 5 - i; j++) {
				System.out.println("0");
			}
			System.out.println();
		}
	}
}
