package com.example.gradletest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GradletestApplicationTests {

	@Test
	void add() {
		assertEquals(4, new Calc().add(2,2), "2 + 2 = 4");
		assertEquals(6, new Calc().add(2,4), "2 + 4 = 6");
	}

}
