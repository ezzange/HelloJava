package collections_ramework.hashset;

import java.util.Objects;

public class Person {

    String name;
    String number;
    int age;

    @Override
    public String toString() {
        return
                "  name="+ name +", number=" + number +", age="+ age+" ";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Person)) return false;

        Person person = (Person) object;

        return this.name.equals(person.name) &&
                this.number.equals(person.number) &&
                this.age == person.age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, number, age);
    }

    public Person(String name, String number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }
}
