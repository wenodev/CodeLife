package set;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class HashSetTest {
    @Test
    void test1() {
        Object[] objects = {"1", new Integer(1), "2", "2", "3", "3"};
        Set set = new HashSet();

        for (int i = 0; i < objects.length; i++) {
            set.add(objects[i]);
        }

        System.out.println(set);

        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Test
    void test2() {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) ((Math.random() * 45) + 1);
            set.add(num);
        }

        List linkedList = new LinkedList(set);
        List arrayList = new ArrayList(set);

        Collections.sort(linkedList);
        Collections.sort(arrayList);
    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    @Test
    void test3() {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("david", 10));
        set.add(new Person("david", 10));

        System.out.println(set);
    }
}
