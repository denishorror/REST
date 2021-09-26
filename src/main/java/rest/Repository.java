package rest;

import java.util.Hashtable;
import java.util.Map;

public class Repository {
    static Map<String, Person> persons = new Hashtable<>();
    static {
        persons.put("Сергей", new Person("Сергей", 35));
        persons.put("Костя", new Person("Сергей", 13));
        persons.put("Саща", new Person("Сергей", 3));
    }
    public Person PersonByName (String name) {
        return persons.get(name);
    }
    public Person addPerson(Person p) {
        persons.put(p.getName(), p);
        return p;
    }
}
