package org.example;

import java.util.List;
import org.example.gui.Gui;
import org.example.processor.DataProcessor;
import org.example.reader.FileReader;

public class Main {
    public static void main(String[] args) {
        Gui gui = new Gui();
        FileReader reader = new FileReader();
        List<Integer> fileData = reader.readFile(gui.getFilePath());
        DataProcessor processor = new DataProcessor();
        processor.process(fileData);
    }
}