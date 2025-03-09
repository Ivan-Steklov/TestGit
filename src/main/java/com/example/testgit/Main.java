package com.example.testgit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

      
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2).collect(Collectors.toList());

        System.out.println(result);

        List<String> names = Arrays.asList("Ivan", "Andrey", "Bob", "Marya", "Alice", "Arckadiy");

        List<String> result2 = names.stream().filter(name -> name.startsWith("A")).map(String::toUpperCase).sorted().collect(Collectors.toList());
        System.out.println(result2);

        List<Person> people = Arrays.asList(new Person("Ivan", 32), new Person("Andrey", 35), new Person("Bob", 25), new Person("Maria", 40), new Person("Alice", 22), new Person("Arckadiy", 25));

        double averAge = people.stream().filter(person -> person.getAge() > 30).mapToInt(Person::getAge).average().orElse(0);

        System.out.println("Средний возраст людей старше 30 лет" + averAge);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


