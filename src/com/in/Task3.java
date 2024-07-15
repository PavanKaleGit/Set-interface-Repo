package com.in;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Task 3 Complex Operations


public class Task3 {

	
	public static void main(String[] args) {
        Set<Person> hashSet = new HashSet<>();

        hashSet.add(new Person(1, "Pavan", 30));
        hashSet.add(new Person(2, "Rohan", 25));
        hashSet.add(new Person(3, "Karan", 35));
        hashSet.add(new Person(4, "Sachin", 40));
        hashSet.add(new Person(5, "Dhanu", 28));

        Person maxAgePerson = findMaxAgePerson(hashSet);
        Person minAgePerson = findMinAgePerson(hashSet);

        System.out.println("Person with max age: " + maxAgePerson);
        System.out.println("Person with min age: " + minAgePerson);

        List<Person> sortedByAge = sortByAge(hashSet);
        System.out.println("Persons sorted by age: " + sortedByAge);

        Set<Person> ageFilteredSet = filterByAge(hashSet, 28);
        System.out.println("Persons with age > 28: " + ageFilteredSet);
    }

    public static Person findMaxAgePerson(Set<Person> set) {
        return set.stream().max(Comparator.comparingInt(p -> p.age)).orElse(null);
    }

    public static Person findMinAgePerson(Set<Person> set) {
        return set.stream().min(Comparator.comparingInt(p -> p.age)).orElse(null);
    }

    public static List<Person> sortByAge(Set<Person> set) {
        List<Person> list = new ArrayList<>(set);
        list.sort(Comparator.comparingInt(p -> p.age));
        return list;
    }

    public static Set<Person> filterByAge(Set<Person> set, int age) {
        Set<Person> result = new HashSet<>();
        for (Person p : set) {
            if (p.age > age) {
                result.add(p);
            }
        }
        return result;
    }
}
