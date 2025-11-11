package ru.netology.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    protected int num = 1;

    public void log(String msg) {
        String currentTime = LocalDateTime.now().format(FORMATTER);
        System.out.println("[" + currentTime + " " + num++ + "] " + msg);
    }

    private static Logger logger;

    private Logger() {

    }

    public static Logger getLogger() {

        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
