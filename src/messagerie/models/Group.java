package messagerie.models;

import java.util.HashSet;
import java.util.Set;

public class Group {
	private String name;
	private String description;
	private String email;
	private Set<User> users;

	public Group(String name) {
		this.name = name;
		users = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public void addUSers(User... users) {
		for (User u : users) {
			if (this.users.add(u)) {
				u.getGroups().add(this);
			}
		}
	}

	public boolean removeUser(User user) {
		if (this.users.remove(user)) {
			return user.getGroups().remove(this);
		}
		return false;
	}

	public int count() {
		return this.users.size();
	}

	public Set<User> getUsers() {
		return users;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Group)) {
			return false;
		}
		return this.name.equals(((Group) obj).getName());

	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return name + "\n" + users.toString();
	}
}
