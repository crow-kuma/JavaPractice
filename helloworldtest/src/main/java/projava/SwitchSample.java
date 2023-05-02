package projava;

public class SwitchSample {
	public static void main(String[] args) {
		var a = 6;
		System.out.println(
			switch (a) {
				case 1, 2 -> "one-two";
				case 3 -> "three";
				case 4 -> "four";
				case 5 -> "five";
				default -> "other";
			}
		);
		
	}
}
