package com.dmdev.lesson19.map;

import com.dmdev.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Person valeria = new Person(1, "Valeria", "Ivanovna");
        Person kirill = new Person(29, "Kirill", "Ivanovich");
        Person dad = new Person(3, "Ivan", "Pavlovich");
        Person mom = new Person(30, "Olga", "Alecsandrovna");
        Person uncle = new Person(45, "Stepa", "Giant");
        Person aunt = new Person(10, "Ira", "Beautiful");
        Map<Integer, Person> map = new TreeMap<>();
        map.put(valeria.getId(), valeria);
        map.put(kirill.getId(), kirill);
        map.putIfAbsent(dad.getId(),dad);
        map.putIfAbsent(mom.getId(),mom);
        map.putIfAbsent(uncle.getId(),uncle);
        map.putIfAbsent(aunt.getId(),aunt);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"="+ entry.getValue());
        }
    }
}
