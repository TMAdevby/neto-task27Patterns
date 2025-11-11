package ru.netology.logger;

public class Logger {
    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }

    private static Logger logger;

    private Logger() {

    }

    public static Logger getLogger() {
        if (logger==null) {
            logger = new Logger();
        }
        return logger;
    }
}
