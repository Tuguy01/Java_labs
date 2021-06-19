package ru.nsu.fit.g19202.tgaifullin.lab2.calcCommands;

import ru.nsu.fit.g19202.tgaifullin.lab2.CalcContext;
import ru.nsu.fit.g19202.tgaifullin.lab2.Command;
import ru.nsu.fit.g19202.tgaifullin.lab2.Main;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class Save implements Command {

        @Override
    public void execute(String[] args, CalcContext context) throws CalcException {
        URL path = Main.class.getClassLoader().getResource("ru.nsu.fit.g19202.tgaifullin.lab2/calc.txt");
        File file = new File(path.getPath());

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(String.valueOf(context.getStack().pop()));
            writer.newLine();
            writer.flush();
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
