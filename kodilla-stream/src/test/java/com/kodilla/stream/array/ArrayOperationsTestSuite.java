package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[] {7, 16, 11, 6, 28, 4, 15, 23, 14, 27};
        //When
        double average = ArrayOperations.getAverage(numbers).getAsDouble();
        //Then
        Assert.assertEquals(15.1, average, 0.00001);
    }
}

