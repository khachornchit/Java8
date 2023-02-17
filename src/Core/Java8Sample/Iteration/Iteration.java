package src.Core.Java8Sample.Iteration;

import java.util.Arrays;
import java.util.List;

import src.Core.Java8Sample.Model.Person;

public class Iteration {

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("James", "Smith", 24), new Person("John", "Johnson", 34),
                new Person("Robert", "Williams", 28), new Person("Michael", "Brown", 39),
                new Person("David", "Jones", 19));

        list.forEach(Person::printPerson);
    }

}