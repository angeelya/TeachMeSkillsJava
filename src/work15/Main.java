package work15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice 1");
        workWithOptional();
        System.out.println("Practice 2");
        workWithStreamList();
        System.out.println("Practice 3");
        getDeveloper();
    }

    private static void getDeveloper() {
        List<Developer> developers = new ArrayList<>(asList(new Developer("Ivan",1),new Developer("Noora",2),new Developer("Alex",3),new Developer("Anna",4),
                new Developer("Uliana",5), new Developer("Ekaterina",6), new Developer("Andrew",11)));
        developers.stream().filter(developer->developer.getName().startsWith("An")&&developer.getId()>10).forEach(developer -> System.out.println(developer));
    }

    private static void workWithStreamList() {
        List<String> strings = new ArrayList<>(asList("Home","Apple","Orange","Array"));
        strings.stream().filter(str->str.startsWith("A")).forEach(str->System.out.println(str));

    }

    private static void workWithOptional() {
        User user = new User();
//        user.setName("Ivan");
        Optional<String> nameUser = Optional.of(Optional.ofNullable(user.getName()).orElse("DEFAULT"));
        nameUser.ifPresent(name -> System.out.println(name));
    }
}
