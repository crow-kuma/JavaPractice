package projava;

import java.util.List;

public class StreamSample2 {
	public static void main(String[] args) {
		var data = List.of("Melody Lane", "Titleholder", "Mowen 2023");

		var result = (int) data.stream().filter(s -> s.length() >= 11).count();
		System.out.println(result);
	}
}
