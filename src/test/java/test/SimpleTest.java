package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import uk.ac.uos.i2p.SimpleForGit;

class SimpleTest {

	@Test
	void testNameNotNull() {
		SimpleForGit sg = new SimpleForGit();
		assertNotNull(sg.getName());
	}

}
