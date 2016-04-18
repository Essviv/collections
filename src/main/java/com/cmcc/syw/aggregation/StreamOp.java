package com.cmcc.syw.aggregation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.cmcc.syw.Utils.randStr;

/**
 * demo of stream operation
 * <p>
 * Created by sunyiwei on 16/4/14.
 */
public class StreamOp {
    public static void main(String[] args) {
        final int COUNT = 100;

        List<Person> persons = build(COUNT);

        //average operation
        System.out.format("Average age is %#.2f. %n",
                persons.stream().mapToInt(Person::getAge).average().getAsDouble());

        //traverse
        persons.stream().filter(e -> e.getAge() >= 10).forEach(e -> System.out.println(e.getName()));
    }

    private static List<Person> build(int count) {
        List<Person> persons = new ArrayList<Person>(count);

        Random random = new Random();
        for (int i = 0; i < count; i++) {
            persons.add(new Person(
                    random.nextBoolean() ? Person.Gender.FEMALE : Person.Gender.MALE,
                    randStr(7), random.nextInt(27)));
        }


        return persons;
    }
}
