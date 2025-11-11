package ru.netology.people;

public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String address;

    private PersonBuilder setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("Фамилия не может быть пустой");
        }
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        if (address != null && address.isBlank()) {
            this.address = null; // пустую строку превращаем в null
        } else {
            this.address = address;
        }
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Имя и фамилия обязательны для создания Person");
        }
        return new Person(name, surname, age, address);
    }
}
