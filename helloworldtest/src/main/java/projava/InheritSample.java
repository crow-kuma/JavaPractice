package projava;

import java.util.List;

public class InheritSample {
	static abstract class User {
		String name;

		User(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}

		abstract String profile();

		@Override
		public String toString() {
			return profile();
		}
	}

	static class Student extends User {
		int score;
		
		Student(String name, int score) {
			super(name);
			this.score = score;
		}

		public int getScore() {
			return score;
		}

		@Override
		String profile() {
			return "学生: %s, 点数: %d".formatted(getName(), getScore());
		}
	}

	static class Teacher extends User {
		String subject;
		
		Teacher(String name, String subject) {
			super(name);
			this.subject = subject;
		}

		public String getSubject() {
			return subject;
		}

		@Override
		String profile() {
			return "先生: %s, 教科: %s".formatted(getName(), getSubject());
		}
	}

	public static void main(String[] args) {
		List<User> people = List.of(
			new User("匿名クラス") {
				@Override
				String profile() {
					return "匿名クラスから来ました。ダミーです。";
				}
			},
			new Student("Kis", 89), 
			new Teacher("hosoya", "Math"));
		for (var p : people) {
			System.out.println("こんにちは%sさん".formatted(p.getName()));
			System.out.println(p);
		}
	}
}
