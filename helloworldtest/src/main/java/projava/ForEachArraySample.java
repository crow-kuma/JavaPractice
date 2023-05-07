package projava;

public class ForEachArraySample {
	public static void main(String[] args) {
		var nums = new int[]{2, 3, 5, 7};
		for (int num : nums) {
			System.out.println(num);
		}

		var names = new String[]{"yuseke", "kis", "sugiyama"};
		for (String name : names) {
			System.out.println(name);
		}
	}
}
