package projava;

import java.util.List;

public class InterfaceSample {
	@FunctionalInterface
	interface Named {
		String name();
		default String hello() {
			return "こんにちは%sさん".formatted(name());
		}
	}

	interface Figure {
		int width();
		int height();
	}

	record Student(String name, int score) implements Named {}
	record Teacher(String name, String subject) implements Named {}
	record Staff(String name, String workAt) implements Named {}

	static class Passenger implements Named {
		@Override
		public String name() {
			return "シンボリルドルフ";
		}
	}

	record Box(int width, int height) implements Figure {}
	record Oval(int width, int height) implements Figure {}

	static void message(Named named) {
		System.out.println("Hello " + named.name());
	}

	public static void main(String[] args) {
		message(()->"no name");
		message(new Student("ゴールドシップ", 100));
		var people = List.of(
			new Student("Kis", 89), 
			new Teacher("hosoya", "Math"),
			new Staff("マカヒキ", "LEX STUD"),
			new Passenger());
		for (var p : people) {
			System.out.println(p.hello());
			//System.out.println("こんにちは%sさん".formatted(p.name()));
		}

		var figures = List.of(
			new Box(10, 20),
			new Oval(15, 25));

		for (var f : figures) {
			var boxArea = f.width() * f.height();
			var ovalArea = f.width() * f.height() * Math.PI / 4;

			System.out.println("四角形であれば、面積は%dです。円であれば、面積は%fです。".formatted(boxArea, ovalArea));

		}
	}


	// record Student(String name, int score) {}
	// record Teacher(String name, String subject) {}

	// public static void main(String[] args) {
	// 	var people = List.of(new Student("Kis", 89), new Teacher("hosoya", "Math"));
	// 	for (var p : people) {
	// 		var n = p instanceof Student s ? s.name() : 
	// 						p instanceof Teacher t ? t.name() : 
	// 						"---";
	// 		System.out.println("こんにちは%sさん".formatted(n));
	// 	}
	// }
}
