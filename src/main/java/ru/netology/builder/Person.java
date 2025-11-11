package ru.netology.builder;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private Integer age;
    private String city;

    public Person(String name, String surname, Integer age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        return age != null;
    }

    public boolean hasAddress() {
        return city != null && !city.isBlank();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return age != null ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String city) {
        this.city = city;
    }

    public void happyBirthday() {
        if (age != null) {
            age++;
        } else {
            age = 1;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" ").append(surname);
        if (hasAge()) {
            sb.append(", возраст: ").append(age);
        }
        if (hasAddress()) {
            sb.append(", город: ").append(city);
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(age, person.age) &&
                Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }

    // Метод для создания билдера ребёнка
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)   // фамилия как у родителя
                .setAddress(this.city)      // город как у родителя
                .setAge(0);                 // возраст 0 (или можно не задавать — тогда будет null)
    }
}
