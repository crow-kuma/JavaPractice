package projava;

public class ClassSample {
	// record Student(String name, int score) {}
	// Convert record to class
	static final class Student {
		private final String name;
		private final int score;
		public Student(String name, int score) {
			this.name = name;
			this.score = score;
		}
		public String name() { return name; }
		public int score() { return score; }
		@Override
		public String toString() {
			return String.format("Student[name=%s, score=%d]", name, score);
		}
	}


	public static void main(String[] args) {
		// define new Student. name is "Kis", score is 89.
		var s = new Student("Kis", 89);
		System.out.println(s);
	}
}
