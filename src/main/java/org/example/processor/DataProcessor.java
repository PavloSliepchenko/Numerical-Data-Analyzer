package org.example.processor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class DataProcessor {
    public Result process(List<Integer> fileData) {
        List<String> result = new ArrayList<>();
        long start = new Date().getTime();
        List<Integer> copy = new ArrayList<>(fileData);
        copy.sort(Comparator.naturalOrder());
        Integer max = copy.get(copy.size() - 1);
        result.add(max.toString());
        Integer min = copy.get(0);
        result.add(min.toString());
        double median = getMedian(copy);
        result.add(Double.toString(median));
        long sum = 0L;
        for (Integer element : fileData) {
            sum += element;
        }
        double arithmeticMeanValue = sum / (fileData.size() * 1.0);
        result.add(Double.toString(arithmeticMeanValue));
        long end = new Date().getTime();
        List<Integer> increaseSequence = longestSequence(fileData);
        result.add(String.valueOf(increaseSequence.size()));
        copy = new ArrayList<>(fileData);
        Collections.reverse(copy);
        List<Integer> decreaseSequence = longestSequence(copy);
        Collections.reverse(decreaseSequence);
        result.add(String.valueOf(decreaseSequence.size()));
        double timeNeededToCalculate = (end - start) / 1000.0;
        result.add(Double.toString(timeNeededToCalculate));
        result.add(String.valueOf(fileData.size()));
        return new Result(result, increaseSequence, decreaseSequence);
    }

    private Double getMedian(List<Integer> fileData) {
        if (fileData.size() % 2 == 0) {
            return (fileData.get(fileData.size() / 2 - 1) + fileData.get(fileData.size() / 2)) / 2.0;
        }
        return fileData.get(fileData.size() / 2) * 1.0;
    }

    private List<Integer> longestSequence(List<Integer> fileData) {
        if (fileData.isEmpty()) {
            return new ArrayList<>();
        }
        int from = 0;
        int to = 0;
        int count = 0;

        int currentFrom = 0;
        int currentTo = 0;
        int currentCount = 0;
        for (int i = 1; i < fileData.size(); i++) {
            if (currentCount == 0 && fileData.get(i) > fileData.get(i - 1)) {
                currentCount = 2;
                currentFrom = i - 1;
                currentTo = i + 1;
            } else if (fileData.get(i) > fileData.get(i - 1)) {
                currentTo = i + 1;
                currentCount++;
            } else {
                if (currentCount > count) {
                    count = currentCount;
                    from = currentFrom;
                    to = currentTo;
                }
                currentCount = 0;
                currentFrom = 0;
                currentTo = 0;
            }
        }
        if (currentCount > count) {
            count = currentCount;
            from = currentFrom;
            to = currentTo;
        }
        return count == 0 ? new ArrayList<>() : fileData.subList(from, to);
    }
}
