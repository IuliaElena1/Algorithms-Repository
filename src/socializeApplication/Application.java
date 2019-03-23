package socializeApplication;

import java.util.ArrayList;
import java.util.List;

public class Application {
	private List<Person> persons = new ArrayList();

	public void addFriend(String person1, String person2, Friend list) {
		Person personOne = getPersonByName(person1);
		Person personTwo = getPersonByName(person2);

		if (personOne == null) {
			personOne = new Person(person1);
			persons.add(personOne);
		}

		if (person2 == null) {
			personTwo = new Person(person2);
			persons.add(personTwo);
		}

		personOne = addFriend(personTwo, list);
		/*
		 * personOne = addCo
		 * 
		 * personOne.addConectionWithListOfFriend(personTwo, persons);
		 * personTwo.addConectionWithListOfFriend(personOne, persons);
		 */

	}

	private Person addFriend(Person personTwo, Friend list) {

		return null;
	}

	private Person getPersonByName(String anyone) {
		for (Person person : persons) {

			if (persons.equals(anyone)) {
				persons.add(person);
				return person;
			}
		}
		return null;

	}

	/*
	 * public static void main(String[] args) { Application app = new Application();
	 * app.addFriend("Ion", "Maria"); app.addFriend("Gigi", "Ion");
	 * app.showFriend(); }
	 */

	public void showFriend() {
		System.out.println(persons);
	}
}
