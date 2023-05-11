package projava;

public class ZeroToUpperOneToLower {
	public static void main(String[] args) {
		var data = "aa0bcd1efg1gg0abc";

		char prev = 0;
		var builder = new StringBuilder();

		for (char ch : data.toCharArray()) {
			// define boolean if prev is uppercase
			boolean isPrevUpper = Character.isUpperCase(prev);
			// define boolean if prev is digit
			boolean isPrevDigit = Character.isDigit(prev);
			// define boolean if current is digit
			boolean isCurrentDigit = Character.isDigit(ch);

			if (!isCurrentDigit) {
				if (isPrevDigit) {
					switch (prev) {
						case '0' -> { ch = Character.toUpperCase(ch);
								builder.append(ch);}
						case '1' -> { ch = Character.toLowerCase(ch);
								builder.append(ch); }
					}
					prev = ch;
				} else if (isPrevUpper) {
					ch = Character.toUpperCase(ch);
					builder.append(ch);
					prev = ch;
				} else {
					ch = Character.toLowerCase(ch);
					builder.append(ch);
					prev = ch;
				}
			} else {
				prev = ch;
			}
		}

		var result = builder.toString();
		System.out.println(data);
		System.out.println(result);
		}
}
