package messagerie.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class User {

	private String firstname;
	private String lastname;
	private LocalDate bDate;
	private Set<Group> groups;

	public User(String firstname, String lastname, LocalDate bDate) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.bDate = bDate;
		this.groups = new HashSet<>();
	}

	public User(String firstname, String lastname) {
		this(firstname, lastname, null);
	}

	public User() {
		this("?", "?", null);
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getAge() {
		return Period.between(bDate, LocalDate.now()).getYears();
	}

	public boolean addIn(Group group) {
		if (this.groups.add(group)) {
			group.getUsers().add(this);
			return true;
		}
		return false;
	}

	public Set<Group> getGroups() {
		return groups;
	}

	public String getEmail() {
		return lastname + "." + firstname;
	}

	public boolean removeFrom(Group group) {
		if (this.groups.remove(group)) {
			return group.getUsers().remove(this);
		}
		return false;
	}

	@Override
	public String toString() {
		return firstname + " " + lastname + " (" + getAge() + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		return this.getEmail().equals(((User) obj).getEmail());

	}

	@Override
	public int hashCode() {
		return getEmail().hashCode();
	}

}
