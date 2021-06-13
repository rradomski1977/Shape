package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperations {
    public static OptionalDouble getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));

        return IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();
    }
}
