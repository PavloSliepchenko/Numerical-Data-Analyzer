package org.example.gui;

import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.List;
import org.example.processor.Result;

public class Gui {
    public String getFilePath() {
        String path = null;
        JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        chooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter extFilter = new FileNameExtensionFilter("Text files", "txt");
        chooser.addChoosableFileFilter(extFilter);
        chooser.setDialogTitle("Choose a text file");
        int returnValue = chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            path = chooser.getSelectedFile().getAbsolutePath();
        } else {
            System.exit(0);
        }
        return path;
    }

    public void showResult(Result resultObject) {
        List<String> result = resultObject.getResult();
        printToConsole(resultObject);
        String message = String.format("""
                Max value: %s
                Min value: %s
                Median value: %s
                Arithmetic mean value: %s
                Longest increasing sequence: %s values
                Longest decreasing sequence: %s values
                """, result.get(0), result.get(1), result.get(2),
                result.get(3), result.get(4), result.get(5));
        JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.PLAIN_MESSAGE);
    }

    private void printToConsole(Result resultObject) {
        List<String> result = resultObject.getResult();
        System.out.println("Max value: " + result.get(0));
        System.out.println("Min value: " + result.get(1));
        System.out.println("Median value: " + result.get(2));
        System.out.println("arithmeticMeanValue: " + result.get(3));
        System.out.printf("Longest increasing sequence. Length: %s elements. Values:%n", result.get(4));
        resultObject.getIncreaseSequence().forEach(System.out::println);
        System.out.printf("Longest decreasing sequence. Length: %s elements. Values:%n", result.get(5));
        resultObject.getDecreaseSequence().forEach(System.out::println);
        System.out.printf("Time needed to process data (without file reading): %s seconds%n", result.get(6));
        System.out.println("Number of elements in the file: " + result.get(7));
    }
}
