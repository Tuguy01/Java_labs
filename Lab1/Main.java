package ru.nsu.fit.g19202.tgaifullin.lab1;

import java.util.Map;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main (String[] args) throws IOException{
        try(FileReader in_file = new FileReader(args[0])) {
            MyReader reader = new MyReader();
            Map<String, Integer> words = reader.read_file(in_file);
            int total = words.get(" ");
            MySorter sorter = new MySorter();
            var list = sorter.sort_words(words);
            MyPrinter printer = new MyPrinter();
            printer.print_words(list, total);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
