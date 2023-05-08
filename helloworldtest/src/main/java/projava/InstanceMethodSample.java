package projava;

public class InstanceMethodSample {
	// record Student(String name, int englishScore, int mathScore){}
	// public static void main(String[] args) {
	// 	var kis = new Student("kis", 60, 80);
	// 	var a = average(kis);
	// 	System.out.println("平均点は%d点です".formatted(a));
		
	// }
	// static int average(Student s) {
	// 	return (s.englishScore() + s.mathScore()) / 2;
	// }

	record Student(String name, int englishScore, int mathScore) {
		int average() {
			return (this.englishScore() + this.mathScore()) / 2;
		}
		String showResult() {
			return name + "さんの平均点は" + average() + "点です。";
		}
		public int maxScore() {
			return Math.max(mathScore(), englishScore());
		}
	}
	public static void main(String[] args) {
		var kis = new Student("kis", 60, 80);
		var a = kis.average();
		System.out.println("平均点は%d点です".formatted(a));
		
		var str = kis.showResult();
		System.out.println(str);

		int max = kis.maxScore();
		System.out.println("最高点は%d点です".formatted(max));
		
	}
}
