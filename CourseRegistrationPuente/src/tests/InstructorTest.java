package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Instructor;

/**
 * Nicole Puente - npuente CIS171 22149 Apr 13, 2022
 */

class InstructorTest {

	@Test
	void testMakeEmailAddress() {
		Instructor test = new Instructor();
		assertEquals("kcat@dmacc.edu", test.makeEmailAddress("kit", "cat"));
		assertEquals("kcat@dmacc.edu", test.makeEmailAddress("KIT", "CAT"));
	}

}
