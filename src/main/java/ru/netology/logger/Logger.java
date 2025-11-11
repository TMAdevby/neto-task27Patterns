package ru.netology.logger;

public class Logger {
    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }
}
