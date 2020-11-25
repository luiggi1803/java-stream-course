package lectures;


import static org.assertj.core.api.Assertions.assertThat;

import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import mockdata.MockData;
import org.junit.Test;

public class Lecture5 {

    final Predicate<Car> predicate = car -> car.getPrice() < 10000;

    @Test
    public void understandingFilter() throws Exception {
        ImmutableList<Car> cars = MockData.getCars();
        List<Car> carsFilter = cars.stream().filter(predicate).collect(Collectors.toList());
        carsFilter.forEach(System.out::println);
        System.out.println(carsFilter.size());
    }

    @Test
    public void ourFirstMapping() throws Exception {
        // transform from one data type to another

//	Function<Person,PersonDTO> funcion=p-> {return new PersonDTO(p.getId(), p.getFirstName(), p.getAge());};
        List<Person> people = MockData.getPeople();
//    List<PersonDTO> dto2= people.stream().map(funcion).collect(Collectors.toList());
//    List<PersonDTO> dto3= people.stream().map(p-> {return new PersonDTO(p.getId(), p.getFirstName(), p.getAge());}).collect(Collectors.toList());

        List<PersonDTO> dto = people.stream().map(PersonDTO::map).collect(Collectors.toList());
        dto.forEach(System.out::println);
        System.out.println(dto.size());
    }

    @Test
    public void averageCarPrice() throws Exception {
        // calculate average of car prices
        List<Car> cars = MockData.getCars();

        DoubleStream promedio = cars.stream().mapToDouble(Car::getPrice);
        System.out.println("Promedio: " + promedio.average().orElse(0));
    }

    @Test
    public void test() throws Exception {

    }
}



