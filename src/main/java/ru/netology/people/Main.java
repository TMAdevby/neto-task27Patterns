package ru.netology.people;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Создаём маму
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();

        // Создаём сына через newChildBuilder()
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();

        System.out.println("У " + mom + " есть сын, " + son);

        // Проверка: у сына должна быть фамилия и город матери
        System.out.println("Фамилия сына: " + son.getSurname());
        System.out.println("Город сына: " + son.getAddress());
        System.out.println("Возраст сына: " + son.getAge().orElse(-1));

        // Проверка обязательных полей
        try {
            new PersonBuilder().build(); // ❌ нет имени и фамилии
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Проверка некорректного возраста
        try {
            new PersonBuilder()
                    .setName("Иван")
                    .setSurname("Иванов")
                    .setAge(-100) // ❌ отрицательный возраст
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Дополнительно: объект без возраста и адреса
        Person guest = new PersonBuilder()
                .setName("Гость")
                .setSurname("Безымянный")
                .build();
        System.out.println("Гость: " + guest);
        System.out.println("Имеет возраст? " + guest.hasAge());
        System.out.println("Имеет адрес? " + guest.hasAddress());
    }
}