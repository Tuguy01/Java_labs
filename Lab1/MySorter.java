package ru.nsu.fit.g19202.tgaifullin.lab1;

import java.util.ArrayList;
import java.util.Map;

public class MySorter implements Sorter{
    public ArrayList<Map.Entry<String, Integer>> sort_words (Map<String, Integer> words){
        var list = new ArrayList<>(words.entrySet());
        list.sort( (a, b) -> {
            int rs = a.getValue().compareTo(b.getValue());
            if (rs == 0){
                rs = a.getKey().compareTo(b.getKey());
            }
            return rs;
        });
        return list;
    }
}
