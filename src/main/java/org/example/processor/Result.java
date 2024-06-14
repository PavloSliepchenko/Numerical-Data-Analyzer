package org.example.processor;

import java.util.List;
import lombok.Data;

@Data
public class Result {
    private List<String> result;
    private List<Integer> increaseSequence;
    private List<Integer> decreaseSequence;

    public Result(List<String> result, List<Integer> increaseSequence, List<Integer> decreaseSequence) {
        this.result = result;
        this.increaseSequence = increaseSequence;
        this.decreaseSequence = decreaseSequence;
    }
}
