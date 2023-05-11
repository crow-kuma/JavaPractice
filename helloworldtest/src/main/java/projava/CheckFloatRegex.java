package projava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFloatRegex {
	static Pattern pat =Pattern.compile("(0|[1-9][0-9]*)(\\.[0-9]+)?");
	static boolean check(String data) {
		Matcher mat = pat.matcher(data);
		return mat.matches();
	}
	public static void main(String[] args) {
		System.out.println(check(""));
		System.out.println(check("012"));
		System.out.println(check(".12"));
		System.out.println(check("12."));
		System.out.println(check("1.2.3"));
		System.out.println(check("1..3"));
		System.out.println(check("0"));
		System.out.println(check("12"));
		System.out.println(check("12.3"));
		System.out.println(check("0.3"));
		System.out.println(check("12.30"));
		System.out.println(check("12.0"));
		System.out.println(check("-12.3"));
		System.out.println(check("--123"));
		System.out.println(check("-12-3"));
	}
}
