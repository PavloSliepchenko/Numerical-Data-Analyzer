package org.example.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {
    public List<Integer> readFile(String path) {
        try {
            List<String> lines = Files.readAllLines(Path.of(path));
            return lines.stream().map(Integer::parseInt).toList();
        } catch (IOException e) {
             throw new RuntimeException("Something went wrong while the file reading and data transformation");
        }
    }
}
