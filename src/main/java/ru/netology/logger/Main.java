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
        logger.log("Введите размер списка: " + n);

        System.out.println("Введите верхнюю границу для значений:");
        Integer m = Integer.parseInt(sc.nextLine());
        logger.log("Введите верхнюю границу для значений: " + m);

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        StringBuilder st = new StringBuilder();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(m + 1));
            //st.append(n).append(" ");
        }
        logger.log("Создаем и наполняем список \n Вот случайный список: " + list);

        System.out.println("Введите порог для фильтра:");
        Integer f = Integer.parseInt(sc.nextLine());
        logger.log("Просим пользователя ввести входные данные для фильтрации\n" +
                "Введите порог для фильтра: " + f);

        Filter filter = new Filter(f);
        List<Integer> fList = filter.filterOut(list);

        logger.log("Прошло фильтр " + fList.size() + " элемента из " + n);
        logger.log("Выводим результат на экран\nОтфильтрованный список: " + fList);
        logger.log("Завершаем программу");
        sc.close();
    }
}
