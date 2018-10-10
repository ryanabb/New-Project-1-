package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import uk.ac.uos.i2p.SimpleForGit;

class SimpleTest {

	@Test
	void testBasicMaths() {
		assertEquals(4, 2+2, "two plus two should be 4");
	}

	@Test
	void testNameNotNull() {
		SimpleForGit sg = new SimpleForGit();
		assertNotNull(sg.getName(), "Even a fresh SimpleForGit object should have a name");
	}

}
