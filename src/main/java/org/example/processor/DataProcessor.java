package org.example.processor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class DataProcessor {
    public void process(List<Integer> fileData) {
        Long beginning = new Date().getTime();
        List<Integer> copy = new ArrayList<>(fileData);
        copy.sort(Comparator.naturalOrder());
        Integer max = copy.get(copy.size() - 1);
        Integer min = copy.get(0);
        Double median = getMedian(copy);
        Long sum = 0L;
        for (Integer element : fileData) {
            sum += element;
        }
        Long end = new Date().getTime();
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        System.out.println("Median value: " + median);
        System.out.println("File numbers sum: " + sum);
        System.out.println("File size: " + fileData.size());
        System.out.println("Time needed to calculate: " + (end - beginning) / 1000.0 + "s");

    }

    private Double getMedian(List<Integer> fileData) {
        if (fileData.size() % 2 == 0) {
            return (fileData.get(fileData.size() / 2 - 1) + fileData.get(fileData.size() / 2)) / 2.0;
        }
        return fileData.get(fileData.size() / 2) * 1.0;
    }
}
