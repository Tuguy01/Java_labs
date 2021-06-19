package ru.nsu.fit.g19202.tgaifullin.lab2.calcCommands;

import ru.nsu.fit.g19202.tgaifullin.lab2.CalcContext;
import ru.nsu.fit.g19202.tgaifullin.lab2.Command;

public class Print implements Command {

    @Override
    public void execute(String[] args, CalcContext context){
        System.out.println(context.getStack());
    }

}
