package ru.netology.logger;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getLogger();
        List<Integer> result = new ArrayList<>();

        return result;
    }
}
