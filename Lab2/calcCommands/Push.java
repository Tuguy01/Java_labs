package ru.nsu.fit.g19202.tgaifullin.lab2.calcCommands;

import ru.nsu.fit.g19202.tgaifullin.lab2.CalcContext;
import ru.nsu.fit.g19202.tgaifullin.lab2.Command;

public class Push implements Command {

    @Override
    public void execute(String[] args, CalcContext context){
        context.getStack().push(Double.valueOf(args[1]));
    }

}
