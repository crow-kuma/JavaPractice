package projava;

public class CheckFloat {
	enum FloatState {
		START, INT, FRAC_START, FRAC, ZERO
	}

	static boolean check (String data) {
		var state = FloatState.START;

		for (char ch : data.toCharArray()) {

			switch (state) {
				case START -> {
					// START
					if (ch == '0') {
						state = FloatState.ZERO;
					} else if (ch >= '1' && ch <= '9' || ch == '-') {
						state = FloatState.INT;
					} else {
						return false;
					}
				}
				case ZERO -> {
					// initial ZERO
					if (ch == '.') {
						state = FloatState.FRAC_START;
					} else {
						return false;
					}
				}
				case INT -> {
					// integer part
					if (ch >= '0' && ch <= '9') {
						state = FloatState.INT;
					} else if (ch == '.') {
						state = FloatState.FRAC_START;
					} else {
						return false;
					}
				}
				case FRAC_START -> {
					// fraction part
					// check if ch is a last character
					boolean isLast = data.indexOf(ch) == data.length() - 1;
					if (ch == '.') {
						return false;
					} else if (isLast) {
						if (ch == '0') {
							return false;
						} else {
							return true;
						}
					} else if (!isLast && ch >= '0' && ch <= '9') {
						state = FloatState.FRAC;
					} else {
						return false;
					}
				}
				case FRAC -> {
					// fraction part
					// check if ch is a last character
					boolean isLast = data.indexOf(ch) == data.length() - 1;

					if (ch == '.') {
						return false;
					} else if (isLast && ch >= '1' && ch <= '9') {
						return true;
					} else if (!isLast && ch >= '0' && ch <= '9') {
						state = FloatState.FRAC;
					} else {
						return false;
					}
				}
				default -> {}
			}
		}
		return switch (state) {
			case ZERO, INT, FRAC -> true;
			default -> false;
		};
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
