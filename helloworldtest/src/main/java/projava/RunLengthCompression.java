package projava;

public class RunLengthCompression {
	public static void main(String[] args) {
		final var COUNTER_BASE = -1;
		var data = "abbcccbaaaabccccccccccccddd";

		var count = COUNTER_BASE;
		char prev = 0;
		var builder = new StringBuilder();
		for (var ch : data.toCharArray()) {
			if (prev == ch) {
				// When the same alphabet is found, increment the counter.
				count++;
				if (count == 9) {
					builder.append('9');
					count = COUNTER_BASE;
					prev = 0;
				}
			} else {
				// When a different alphabet is found, if >= 0, append char and 0 and counter.
				if (count >= 0) {
					builder.append((char) ('0' + count));
					count = COUNTER_BASE;
				}
				builder.append(ch);
				prev = ch;
			}
		}
		// if the last alphabet is the same, append the counter.
		if (count >= 0) {
			builder.append((char) ('0' + count));
		}
		var result = builder.toString();
		System.out.println(data);
		System.out.println(result);
	}
}
