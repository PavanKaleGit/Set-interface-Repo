package com.in;


//Task 1: Custom Object Manipulation


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Person {
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) 
        return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "', age=" + age + '}';
    }



    public static void main(String[] args) {
        Set<Person> hashSet = new HashSet<>();
        Set<Person> linkedHashSet = new LinkedHashSet<>();

        Person p1 = new Person(1, "Pavan", 30);
        Person p2 = new Person(2, "Rohan", 25);
        Person p3 = new Person(1, "Pavan", 30); // Duplicate based on id
        Person p4 = new Person(3, "Karan", 35);

        addPerson(hashSet, p1);
        addPerson(hashSet, p2);
        addPerson(hashSet, p3);
        addPerson(hashSet, p4);

        addPerson(linkedHashSet, p1);
        addPerson(linkedHashSet, p2);
        addPerson(linkedHashSet, p3);
        addPerson(linkedHashSet, p4);

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }

    public static void addPerson(Set<Person> set, Person person) {
        set.add(person);
    }
}
