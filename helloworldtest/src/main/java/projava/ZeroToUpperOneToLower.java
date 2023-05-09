package projava;

public class ZeroToUpperOneToLower {
	public static void main(String[] args) {
		var data = "aa0bcd1efg1gg0abc";

		char prev = 0;
		var builder = new StringBuilder();
		for (char ch : data.toCharArray()) {
			// Define boolean to check if prev is uppercase or lowercase
			boolean isUpper = Character.isUpperCase(prev);
			// Define boolean to check if prev is a digit
			boolean isDigit = Character.isDigit(prev);

			


			// if (prev == '0' || isUpper) {
			// 	var upper = Character.toUpperCase(ch);
			// 	builder.append(upper);
			// 	prev = upper;
			// } else if (prev == '1' || !isUpper) {
			// 	var lower = Character.toLowerCase(ch);
			// 	builder.append(lower);
			// 	prev = lower;
			// } else if (ch == '0' || ch == '1') {
			// 	prev = ch;
			// } else {
			// 	builder.append(ch);
			// 	prev = ch;
			// }
		}
		var result = builder.toString();
		System.out.println(data);
		System.out.println(result);
	}
}
