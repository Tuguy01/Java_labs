package ru.nsu.fit.g19202.tgaifullin.lab2;

import java.util.*;

public class CalcContext {
    private Deque<Double> stack = new ArrayDeque<>();
    private Map<String, Double> params = new HashMap<>();

    public Deque<Double> getStack(){
        return stack;
    }

    public Map<String, Double> getParams(){
        return params;
    }

}
