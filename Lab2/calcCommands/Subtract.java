package ru.nsu.fit.g19202.tgaifullin.lab2.calcCommands;

import ru.nsu.fit.g19202.tgaifullin.lab2.CalcContext;
import ru.nsu.fit.g19202.tgaifullin.lab2.Command;

import java.util.Deque;

public class Subtract implements Command{

    @Override
    public void execute(String[] args, CalcContext context) throws CalcException{
        Deque<Double> stack = context.getStack();
        if (stack.size() < 2){
            throw new CalcException("Command expects two values");
        }
        var first = stack.pop();
        var second = stack.pop();
        stack.push(second - first);
    }

}
