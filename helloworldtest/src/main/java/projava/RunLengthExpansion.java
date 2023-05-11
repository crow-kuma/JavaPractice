package projava;

public class RunLengthExpansion {
	public static void main(String[] args) {
		var data = "ab0c1ba2bc9cd1";
		var builder = new StringBuilder();

		char prev = 0;

		for (char ch : data.toCharArray()) {
			// define boolean if ch is a digit
			boolean isDigit = Character.isDigit(ch);
			// if ch is a digit, append the previous character ch + 2 times
			if (isDigit) {
				builder.append(prev);
				for (int i = 0; i < (ch - '0'); i++) {
					builder.append(prev);
				}
				prev = ch;
			} else {
				builder.append(ch);
				prev = ch;
			}
		}

		var result = builder.toString();
		System.out.println(data);
		System.out.println(result);
			
	}
}
