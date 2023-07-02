package rtn.stream.lambda;


import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageSquare {

    static double getOfOddNumber(int[] input) {

        OptionalDouble square = IntStream.of(input).
                filter(i -> i % 2 != 0).
                map(i -> i * i).
                average();
        if (square.isPresent()) {
            return square.getAsDouble();
        }
        return 0;
    }
}
