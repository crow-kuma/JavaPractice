package projava;

import java.util.ArrayList;
import java.util.List;

public class StreamListSample3 {
	public static void main(String[] args) {
		var fruits = List.of("apple", "banana", "grape");
		var result = new ArrayList<String>();
		var num = 0;
		
		for (var s : fruits) {
			if (s.length() == 5) {
				result.add(s);
				num++;
			}
		}
		System.out.println(result);
		System.out.println(num);

		for (var s2 : result) {
			if (s2.contains("p")) {
				System.out.println(s2 + " Yes");
			} else {
				System.out.println(s2 + " No");
			}
		}
	}
}
