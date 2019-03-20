package socializeApplication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {

	private String name;
	private Map<Person, Friend> friends = new HashMap<>();

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Map<Person, Friend> getFriends() {
		return friends;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void addConectionWithListOfFriend(Person person, List<Person> persons) {
		friends.put(person, (Friend) persons);

	}

	public void addFriend(Person person, Friend friend) {
		friends.put(person, friend);
	}

	@Override
	public String toString() {
		return name;
	}

}
