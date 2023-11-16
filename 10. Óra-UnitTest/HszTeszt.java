package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.example.Haromszog;
import org.example.HaromszogExcpetion;
import org.junit.jupiter.api.Test;

public class HszTeszt {

	@Test
	void oldalhosszak1() {
		try {
			Haromszog hsz1 = new Haromszog(3, 4, 5);
			assertTrue(hsz1.getC() > hsz1.getB());
		} catch (HaromszogExcpetion e) {
			fail("kivetel");
		}
	}

	@Test
	void oldalhosszak2() {
		try {
			Haromszog hsz1 = new Haromszog(3, 4, 5);
			assertTrue(hsz1.getB() > hsz1.getA());
		} catch (HaromszogExcpetion e) {
			fail("kivetel");
		}
	}

	@Test
	void elso() {
		try {
			Haromszog hsz1 = new Haromszog(3, 4, 5);
			assertEquals(Math.PI / 2, hsz1.getGamma());
		} catch (HaromszogExcpetion e) {
			fail("kivetel");
		}
	}

	@Test
	void masodik() {
		try {
			// lehetne,de nincs meg a hiba
			Haromszog hsz1 = new Haromszog(3, 3, 3);
			assertEquals(Math.PI / 3, hsz1.getGamma());
			assertEquals(Math.PI / 3, hsz1.getAlfa());
			assertEquals(Math.PI / 3, hsz1.getBeta());
		} catch (HaromszogExcpetion e) {
			fail("kivetel");
		}
	}

	@Test
	void masodik1() {
		try {
			double delta = 0.0001;
			Haromszog hsz1 = new Haromszog(3, 3, 3);
			assertEquals(Math.PI / 3, hsz1.getBeta(), delta);
		} catch (HaromszogExcpetion e) {
			fail("kivetel");
		}
	}

	@Test
	void masodik2() {
		try {
			// itt is a delta oldana meg
			Haromszog hsz1 = new Haromszog(3, 3, 3);
			assertEquals(Math.PI / 3, hsz1.getGamma());
		} catch (HaromszogExcpetion e) {
			fail("kivetel");
		}
	}

	@Test
	void masodik3() {
		try {
			// itt is a delta oldana meg
			Haromszog hsz1 = new Haromszog(3, 3, 3);
			assertEquals(Math.PI / 3, hsz1.getAlfa());
		} catch (HaromszogExcpetion e) {
			fail("kivetel");
		}
	}

	@Test
	void oldalhossznegativ1() {
		assertThrowsExactly(HaromszogExcpetion.class, () -> new Haromszog(-3, 4, 5));
	}

	@Test
	void oldalhossznegativ2() {
		assertThrowsExactly(HaromszogExcpetion.class, () -> new Haromszog(3, -4, 5));
	}

	@Test
	void oldalhossznegativ3() {
		assertThrowsExactly(HaromszogExcpetion.class, () -> new Haromszog(3, 4, -5));
	}

	@Test
	void oldalhossznulla1() {
		assertThrowsExactly(HaromszogExcpetion.class, () -> new Haromszog(0, 4, 5));
	}

	@Test
	void oldalhossznulla2() {
		assertThrowsExactly(HaromszogExcpetion.class, () -> new Haromszog(2, 4, 0));
	}

	@Test
	void oldalhossznulla3() {
		assertThrowsExactly(HaromszogExcpetion.class, () -> new Haromszog(1, 0, 5));
	}

	@Test
	void haromszogEgyenlotlenseg(){
		assertThrowsExactly(HaromszogExcpetion.class, () -> new Haromszog(1,2,30));
	}
}
