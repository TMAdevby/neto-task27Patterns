package ru.netology.logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();

        Scanner sc = new Scanner(System.in);

        logger.log("Запускаем программу");
        System.out.println("Введите входные данные для списка.");
        logger.log("Просим пользователя ввести входные данные для списка.");

        System.out.println("Введите размер списка:");
        Integer n = Integer.parseInt(sc.nextLine());
        logger.log("Введите размер списка:");

        System.out.println("Введите верхнюю границу для значений:");
        Integer m = Integer.parseInt(sc.nextLine());
        logger.log("Введите верхнюю границу для значений:");

    }
}
