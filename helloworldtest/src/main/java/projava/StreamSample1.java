package projava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample1 {
	public static void main(String[] args) {
		var data = List.of("Melody Lane", "Titleholder", "Mowen 2023");
		// 結果格納用リスト
		var result = data.stream().filter(s -> s.length() >= 11).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(result);
	}
}
