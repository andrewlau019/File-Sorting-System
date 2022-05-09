package unit_tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTests {

	/**
	 * Test that the version of the application is not NULL
	 * and is what it should be.
	 */
	@Test
	void testAppVersion() {
		assertNotNull("Version String is Null", main.Main.VERSION);
		assertEquals("v0.1", main.Main.VERSION);
	}

}
