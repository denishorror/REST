package rest;

import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    Repository repository = new Repository();

    //    @RequestMapping("/person")
    @GetMapping("/person")
    public Person person(@RequestParam(value = "name", defaultValue = "") String name) {
        return repository.PersonByName(name);
    }

    @PostMapping("/person")
    public Person personUpdate(
            @RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "age", required = true) int age) {
        Person p = repository.PersonByName(name);
        if (p != null) {
            p.setAge(age);
            return p;
        } else {
            return repository.addPerson(new Person(name, age));
        }
    }

}
