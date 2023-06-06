package com.dmdev.lesson19.map;

import com.dmdev.lesson19.person.Person;

import java.lang.reflect.Array;
import java.util.*;

public class SortExample {
    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("123", "345", "14", "678");
//        Collections.sort(strings);
//        System.out.println(strings);
        List<Person> people = Arrays.asList(
                new Person(1, "Valeria", "Ivanovna"),
                new Person(29, "Kirill", "Ivanovich"),
                new Person(3, "Murka", "Ivanovna")
        );
        Collections.sort(people);
        System.out.println(people);
//        people.sort(new FirstNameComparator());
        people.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
        System.out.println(people);
    }
    public static class FirstNameComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
