package work31.home.observer;

import java.util.ArrayList;
import java.util.List;

public class Flower {
    private List<Person> people = new ArrayList<>();
    public void addPerson (Person person)
    {
        people.add(person);
    }
    public void removePerson(Person person)
    {
        people.remove(person);
    }
    public void notifyPersonAboutWatering()
    {
        people.forEach(person -> {
            person.getInformationAboutWatering();
        });
    }
}
