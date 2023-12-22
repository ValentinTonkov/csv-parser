package src;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("people.csv");

            PeopleCsvParser parser = new PeopleCsvParser();
            final List<Person> people = parser.parse(f);

            Collections.sort(people);
            people.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
