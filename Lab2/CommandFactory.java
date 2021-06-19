package ru.nsu.fit.g19202.tgaifullin.lab2;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public final class CommandFactory {

    private final Map<String, Command> commands = new HashMap<>();

    private static class Helper {
        private static final CommandFactory factory = new CommandFactory();
    }
    public static CommandFactory getInstance(){
        return Helper.factory;
    }

    private CommandFactory(){
        try(var in = Main.class.getClassLoader().getResourceAsStream("ru.nsu.fit.g19202.tgaifullin.lab2/Commands.properties")){
            Properties props = new Properties();
            props.load(in);
            //System.out.println(props);
            for( var name: props.stringPropertyNames()){
                String clsName = props.getProperty(name);
                var cmd = (Command)Class.forName(clsName).newInstance();
                commands.put(name, cmd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Command findCommandByName(String name){
        return commands.get(name);
    }
}
