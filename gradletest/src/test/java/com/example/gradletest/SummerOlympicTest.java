package com.example.gradletest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

@SuppressWarnings("NonAsciiCharacters")
class SummerOlympicTest {
	//近代オリンピック開始以前
	@Test
	void 近代オリンピック開始以前() {
		assertFalse(new SummerOlympic().isSummerOlympicYear(1888), "1888年");
		assertFalse(new SummerOlympic().isSummerOlympicYear(1892), "1892年");
		assertFalse(new SummerOlympic().isSummerOlympicYear(1895), "1895年");
		// 近代オリンピック初回開催
		assertTrue(new SummerOlympic().isSummerOlympicYear(1896), "1896年");
	}

	// 四年周期の一般的な開催年
	@Test
	void 四年周期の一般的な開催年() {
		int[] years = { 1900, 1920, 1964, 1936, 2000 };
		for (int year : years) {
			assertTrue(new SummerOlympic().isSummerOlympicYear(year), year + "年");
		}
	}

	// 四年周期から外れる非開催年
	@Test
	void 四年周期から外れる非開催年() {
		int[] years = { 1905, 1907, 1925, 1967, 2001 };
		for (int year : years) {
			assertFalse(new SummerOlympic().isSummerOlympicYear(year), year + "年");
		}
	}

	// 戦争・パンデミックで開催されなかった年
	@Test
	void 戦争_パンデミックで開催されなかった年() {
		int[] years = { 1916, 1940, 1944, 2020 };
		for (int year : years) {
			assertFalse(new SummerOlympic().isSummerOlympicYear(year), year + "年");
		}
	}

	// 四年間隔ではない例外的な開催年
	@Test
	void 四年間隔ではない例外的な開催年() {
		//新型コロナウイルスの影響で延期開催
		assertTrue(new SummerOlympic().isSummerOlympicYear(2021), "2021年");
	}

	// 境界値上限
	@Test
	void 境界値上限() {
		assertDoesNotThrow(() -> new SummerOlympic().isSummerOlympicYear(2031), "2031年");
		assertDoesNotThrow(() -> new SummerOlympic().isSummerOlympicYear(2032), "2032年");
		// 開催が決定している2032年以降は例外発生
		assertThrows(IllegalArgumentException.class, 
				() -> new SummerOlympic().isSummerOlympicYear(2033));
		assertThrows(IllegalArgumentException.class, 
				() -> new SummerOlympic().isSummerOlympicYear(2054));
	}
}
