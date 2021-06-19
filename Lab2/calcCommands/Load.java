package ru.nsu.fit.g19202.tgaifullin.lab2.calcCommands;

import ru.nsu.fit.g19202.tgaifullin.lab2.CalcContext;
import ru.nsu.fit.g19202.tgaifullin.lab2.Command;
import ru.nsu.fit.g19202.tgaifullin.lab2.Main;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class Load implements Command {


    @Override
    public void execute(String[] args, CalcContext context) throws CalcException {
        double temp = 0;

        URL path = Main.class.getClassLoader().getResource("ru.nsu.fit.g19202.tgaifullin.lab2/calc.txt");
        File file = new File(path.getPath());

        Scanner scanner = null;

        try{
            scanner = new Scanner(file);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        temp = scanner.nextDouble();
        context.getStack().push(temp);
    }
}
