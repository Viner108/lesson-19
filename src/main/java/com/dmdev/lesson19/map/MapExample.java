package com.dmdev.lesson19.map;

import com.dmdev.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person valeria = new Person(1, "Valeria", "Ivanovna");
        Person kirill = new Person(2, "Kirill", "Ivanovich");
        Person dad = new Person(2, "Ivan", "Pavlovich");
        Map<Integer, Person> map = new HashMap<>(32);
        map.put(valeria.getId(), valeria);
        map.put(kirill.getId(), kirill);
        map.putIfAbsent(dad.getId(),dad);
//        System.out.println(map.get(2));
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());
//        for (Person person : map.values()) {
//            System.out.println(person.getFirstName());
//        }
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
        System.out.println(map.containsKey(2));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(4,dad));
    }
}
