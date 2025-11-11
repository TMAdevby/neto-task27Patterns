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
        logger.log("Запускаем фильтрацию");
        for (Integer num : source){
            if(num >= treshold){
                result.add(num);
                logger.log(" Элемент \'" + num + "\' проходит ");
            }else{
                logger.log(" Элемент \'" + num + "\' не проходит ");
            }
        }
        return result;
    }
}
