package socializeApplication;

import java.util.ArrayList;
import java.util.List;

public class Friend {

	private List<Person> friends = new ArrayList<Person>();

	public List<Person> getFriends() {
		return friends;
	}

	public Friend(List<Person> friends) {
		super();
		this.friends = friends;
	}

}
