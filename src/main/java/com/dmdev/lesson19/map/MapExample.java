package com.dmdev.lesson19.map;

import com.dmdev.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person valeria = new Person(1, "Valeria", "Ivanovna");
        Person kirill = new Person(2, "Kirill", "Ivanovich");
        Map<Integer,Person> map=new HashMap<>();
        map.put(valeria.getId(),valeria);
        map.put(kirill.getId(),kirill);
        System.out.println(map.get(2));
    }
}
