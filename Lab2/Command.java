package ru.nsu.fit.g19202.tgaifullin.lab2;

import ru.nsu.fit.g19202.tgaifullin.lab2.calcCommands.CalcException;

public interface Command {

    void execute(String[] args, CalcContext context) throws CalcException;

}
