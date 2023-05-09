package projava;

import java.util.Arrays;

public class BiggerNumberArray {
	public static void main(String[] args) {
		int[] data = new int[] {3, 6, 9, 4, 2, 1, 5};
		int[] result = new int[data.length];
		for (int i = 0; i < data.length - 1; i++) {
			int firstNum = data[i];
			int secondNum = data[i + 1];
			if (firstNum > secondNum) {
				result[i] = firstNum;
			} else {
				result[i] = secondNum;
			}
		}
		result[data.length - 1] = data[data.length - 1]; 

		System.out.println(Arrays.toString(result));
	}
}
