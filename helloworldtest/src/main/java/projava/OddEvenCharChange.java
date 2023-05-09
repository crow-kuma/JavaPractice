package projava;

public class OddEvenCharChange {
	public static void main(String[] args) {
		String data = "abcdef";
		var builder = new StringBuilder();
		boolean isOdd = data.length() % 2 == 1;

		for (int i = 0; i < data.length(); i++) {
			if(i != data.length() - 1 && i % 2 == 0) {
				char ch0 = data.charAt(i);
				char ch1 = data.charAt(i + 1);
				builder.append(ch1);
				builder.append(ch0);
			}
		}
		if (isOdd) {
			builder.append(data.charAt(data.length() - 1));
		}
		var result = builder.toString();
		System.out.println(data);
		System.out.println(result);
	}
}
