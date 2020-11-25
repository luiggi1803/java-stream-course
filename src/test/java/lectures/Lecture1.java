package lectures;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Person;

import com.google.common.collect.ImmutableList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;


public class Lecture1 {

    @Test
    public void imperativeApproach() throws IOException {
        List<Person> people = MockData.getPeople();
        List<Person> personas = Lists.newArrayList();
        int indice = 0;

        for (Person person : people) {
            if (indice == 10) {
                break;
            }

            if (person.getAge() < 18) {
                personas.add(person);
                indice++;
            }
        }

        for (Person person : personas) {
            System.out.println(person.toString());
        }


    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        System.out.println("===================================");
        List<Person> people = MockData.getPeople();

        List<Person> youngPeople = people.stream()
                .filter(c -> c.getAge() < 18)
                .limit(10)
                .collect(Collectors.toList());


        youngPeople.forEach(System.out::println);
    }
}
