package com.in;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Task 2: Set Operations
public class Task2 {
	
	
	public static void main(String[] args) 
	{
        Set<Person> hashSet = new HashSet<>();
        Set<Person> linkedHashSet = new LinkedHashSet<>();

        hashSet.add(new Person(1, "Pavan", 30));
        hashSet.add(new Person(2, "Rohan", 25));
        hashSet.add(new Person(3, "Karan", 35));
        linkedHashSet.add(new Person(1, "Pavan", 30));
        linkedHashSet.add(new Person(4, "Sachin", 40));
        linkedHashSet.add(new Person(5, "Dhanu", 28));

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<Person> union = new HashSet<>(hashSet);
        union.addAll(linkedHashSet);
        System.out.println("Union: " + union);

        Set<Person> intersection = new HashSet<>(hashSet);
        intersection.retainAll(linkedHashSet);
        System.out.println("Intersection: " + intersection);

        Set<Person> difference1 = new HashSet<>(hashSet);
        difference1.removeAll(linkedHashSet);
        System.out.println("Difference (HashSet - LinkedHashSet): " + difference1);

        Set<Person> difference2 = new HashSet<>(linkedHashSet);
        difference2.removeAll(hashSet);
        System.out.println("Difference (LinkedHashSet - HashSet): " + difference2);
    }

}
