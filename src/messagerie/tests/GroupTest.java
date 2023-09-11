package messagerie.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import messagerie.models.Group;
import messagerie.models.User;

class GroupTest {

	private Group group;

	@BeforeEach
	void setUp() throws Exception {
		group = new Group("Groupe de test");
	}

	@Test
	void testAddUSers() {
		assertEquals(0, group.getUsers().size());
		User u1 = new User("J", "DOE");
		User u2 = new User("J", "SMITH");
		group.addUSers(u1, u2);
		assertEquals(2, group.getUsers().size());
		assertEquals(group, u1.getGroups().iterator().next());
		assertEquals(group, u2.getGroups().iterator().next());
		assertEquals(1, u1.getGroups().size());
		assertEquals(1, u2.getGroups().size());

		group.addUSers(u1);
		assertEquals(2, group.getUsers().size());
		group.addUSers(new User("J", "SMITH"));
		assertEquals(2, group.getUsers().size());
	}

	@Test
	void testRemoveUser() {
		assertEquals(0, group.getUsers().size());
		User u3 = new User("J", "Martin");
		User u4 = new User("J", "Sacha");
		group.addUSers(u3);
		group.addUSers(u4);
		assertEquals(2, group.getUsers().size());
		group.removeUser(u3);
		assertEquals(1, group.getUsers().size());
		assertFalse(group.getUsers().contains(u3));
		assertTrue(group.getUsers().contains(u4));
		group.removeUser(new User("J", "Sacha"));
		assertEquals(0, group.getUsers().size());
		assertFalse(group.getUsers().contains(u4));
		assertFalse(group.removeUser(u3));
		assertFalse(group.removeUser(new User("J", "Martin")));
	}

	@Test
	void testCount() {
		assertEquals(0, group.count());
		group.getUsers().add(new User());
		assertEquals(1, group.count());
	}

}
