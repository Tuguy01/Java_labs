package ru.nsu.fit.g19202.tgaifullin.lab1;

import java.io.FileReader;
import java.util.Map;

public interface Reader {
    public Map<String, Integer> read_file (FileReader in_file);
}
