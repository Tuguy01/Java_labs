package ru.nsu.fit.g19202.tgaifullin.lab2;


import ru.nsu.fit.g19202.tgaifullin.lab2.calcCommands.CalcException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){
        CalcContext context = new CalcContext();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            CommandFactory factory = CommandFactory.getInstance();
            while (true) {
                String arg = reader.readLine();
                if (arg == null || arg.isEmpty()) {
                    break;
                }
                var cmdArgs = arg.split(" ");
                var cmd = factory.findCommandByName(cmdArgs[0]);
                if (cmd == null) {
                    System.out.println("Command not found");
                    continue;
                }
                try {
                    cmd.execute(cmdArgs, context);
                } catch (CalcException e){
                    e.printStackTrace();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}


