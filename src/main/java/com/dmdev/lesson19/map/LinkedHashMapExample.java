package com.dmdev.lesson19.map;

import com.dmdev.lesson19.person.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Person valeria = new Person(1, "Valeria", "Ivanovna");
        Person kirill = new Person(29, "Kirill", "Ivanovich");
        Person murka = new Person(3, "Murka", "Ivanovna");
        Map<Integer, Person> map = new LinkedHashMap<>();
        map.put(valeria.getId(), valeria);
        map.put(kirill.getId(), kirill);
        map.putIfAbsent(murka.getId(),murka);
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
