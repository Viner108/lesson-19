package com.dmdev.lesson19.person;

public class PersonExample {
    public static void main(String[] args) {
        Person valeria = new Person(1, "Valeria", "Ivanovna");
        Person valeria1 = new Person(1, "Valeria", "Ivanovna");
        Person kirill = new Person(2, "Kirill", "Ivanovich");
        System.out.println(valeria.hashCode());
        System.out.println(valeria1.hashCode());
        System.out.println(kirill.hashCode());
        System.out.println(valeria.equals(kirill));
        System.out.println(valeria.equals(valeria1));
    }
}
