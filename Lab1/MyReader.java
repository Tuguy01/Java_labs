package ru.nsu.fit.g19202.tgaifullin.lab1;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyReader implements Reader{

    public Map<String, Integer> read_file (FileReader in_file){
        Map<String, Integer> words = new HashMap<>();
        try {
            StringBuilder sb = new StringBuilder();
            int temp = 0;

            String temp_str = " ";
            words.compute(temp_str, (key, prev) -> {
                return 0;
            });

            while ((temp = in_file.read()) != -1) {
                char temp_char = (char) temp;
                if (Character.isLetterOrDigit(temp_char)) {
                    sb.append(Character.toLowerCase(temp_char));
                } else if (sb.length() > 0) {
                    words.compute(sb.toString(), (key, prev) -> {
                        return prev == null ? 1 : prev + 1;
                    });
                    words.compute(temp_str, (key, prev) -> {
                        return prev == null ? 0 : prev + 1;
                    });
                    sb.setLength(0);
                }
            }

            if (sb.length() > 0) {
                words.compute(sb.toString(), (key, prev) -> {
                    return prev == null ? 1 : prev + 1;
                });
                words.compute(temp_str, (key, prev) -> {
                    return prev == null ? 0 : prev + 1;
                });
                sb.setLength(0);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        return words;

    }
}
