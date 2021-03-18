package ru.nsu.fit.g19202.tgaifullin.lab1;

import java.util.ArrayList;
import java.util.Map;

public class MyPrinter implements Printer{

    public void print_words (ArrayList<Map.Entry<String, Integer>> list, int total){
        for (var e : list){
            if (!(e.getKey().equals(" "))){
                System.out.printf("%s\t%s\t%s%s\n", e.getKey(), e.getValue(), 100 * e.getValue() / total, "%");
            }
        }
    }
}
