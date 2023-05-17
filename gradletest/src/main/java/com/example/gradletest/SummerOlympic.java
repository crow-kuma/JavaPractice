package com.example.gradletest;

public class SummerOlympic {
	/**
	 * 夏季オリンピックかどうかを判定する
	 * @param year　西暦
	 * @return　夏季オリンピックの年の場合はtrue
	 * @throws IllegalArgumentException　まだオリンピック開催年か確定していない年を入力した場合
	 */
	public boolean isSummerOlympicYear(int year) throws IllegalArgumentException{
		if (2032 < year) {
			throw new IllegalArgumentException("2032年以降は未対応です。入力：" + year);
		}
		// List of the years that the Summer Olympic Games were not held due to war or pandemic
		int[] cancelledYears = { 1916, 1940, 1944, 2020 };
		for (int cancelledYear : cancelledYears) {
			if (cancelledYear == year) {
				return false;
			}
		}

		if (1896 > year) {
			return false;
		}

		// The year that the Summer Olympic Game was held exceptionally due to the COVID-19 pandemic
		if (2021 == year) {
			return true;
		}
		return year % 4 == 0;
	}
}
