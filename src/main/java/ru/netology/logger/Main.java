package ru.netology.logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        StringBuilder st = new StringBuilder();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(m + 1));
            st.append(n).append(" ");
        }
        logger.log("Создаем и наполняем список \n Вот случайный список: " + st);



        logger.log("Просим пользователя ввести входные данные для фильтрации\n" +
                "Введите порог для фильтра: 4" + st);
    }
}
