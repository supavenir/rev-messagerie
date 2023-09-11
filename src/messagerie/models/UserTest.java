package messagerie.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

	private User user;

	@BeforeEach
	void setUp() throws Exception {
		user = new User("DOE", "m", LocalDate.of(2000, 01, 01));
	}

	@Test
	void testGetAge() {
		User u1 = new User("DOE", "m", LocalDate.of(2000, 01, 01));
		User u2 = new User("DOE", "m", LocalDate.of(2000, 9, 11));
		User u3 = new User("DOE", "m", LocalDate.of(2000, 9, 12));

		assertEquals(23, u1.getAge());
		assertEquals(23, u2.getAge());
		assertEquals(22, u3.getAge());
	}

	@Test
	void testAddIn() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveFrom() {
		fail("Not yet implemented");
	}

}
