package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class PeopleCsvParser implements CsvParser<Person>{

    public List<Person> parse(File file) throws IOException {
        List<Person> people = new LinkedList<>();
        BufferedReader input = new BufferedReader(new FileReader(file));

        String line;
        input.readLine();
        while ((line = input.readLine()) != null ){
            System.out.println(line);
            String[] words = line.split(",");
            people.add(new Person(Integer.parseInt(words[0]), words[1], words[2], Integer.parseInt(words[3]), words[4]));
        }
        return people;
    }
}