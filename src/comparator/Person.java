package comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    private static int compare(Person o1, Person o2) {
        return Integer.compare(o1.height, o2.height);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.name) == 0) {
            if (this.age > o.age) return 1;
            else if (this.age == o.age) return 0;
            else return -1;
        };

        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        ArrayList<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Alex", 16, 175, 64));
        peoples.add(new Person("Bek", 41, 185, 71));
        peoples.add(new Person("Amir", 21, 175, 89));
        peoples.add(new Person("Roma", 65, 160, 64));
        peoples.add(new Person("Lex", 18, 190, 90));
        peoples.add(new Person("Max", 19, 182, 71));
        peoples.add(new Person("Alexander", 20, 187, 90));
        peoples.add(new Person("Vika", 20, 160, 41));
        peoples.add(new Person("Roma", 11, 150, 35));
        peoples.add(new Person("Liza", 32, 154, 43));
        peoples.add(new Person("Stepa", 15, 160, 54));
        peoples.add(new Person("Liza", 9, 135, 28));
        peoples.add(new Person("Max", 67, 150, 41));
        peoples.add(new Person("Artem", 15, 168, 50));

        Collections.sort(peoples);
//        peoples.sort(Person::compare);
        for (Person people : peoples) {
            System.out.println(people);
        }
    }
}
