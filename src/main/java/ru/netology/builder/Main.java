package ru.netology.builder;

public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();

        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();

        System.out.println("У " + mom + " есть сын, " + son);

        System.out.println("Фамилия сына: " + son.getSurname());
        System.out.println("Город сына: " + son.getAddress());
        System.out.println("Возраст сына: " + son.getAge().orElse(-1));

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            new PersonBuilder()
                    .setName("Иван")
                    .setSurname("Иванов")
                    .setAge(-100)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        Person guest = new PersonBuilder()
                .setName("Гость")
                .setSurname("Безымянный")
                .build();
        System.out.println("Гость: " + guest);
        System.out.println("Имеет возраст? " + guest.hasAge());
        System.out.println("Имеет адрес? " + guest.hasAddress());
    }
}