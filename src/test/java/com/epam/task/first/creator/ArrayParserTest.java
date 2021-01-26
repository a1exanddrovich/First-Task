package com.epam.task.first.creator;

import com.epam.task.first.ArrayCreator;
import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArrayParserTest {

    @Test
    public void ShouldReturnParsedStringWithoutGaps() {

        ArrayParser parser = new ArrayParser();

        Array actual = parser.parse("1 2 3 -9");
        Array expected = new Array(1, 2, 3, -9);

        List<Integer> actualInt = actual.getElements();
        List<Integer> expectedInt = expected.getElements();

        boolean result = true;

        for(int i = 0; i < actualInt.size(); i++) {

            int left = actualInt.get(i);
            int right = expectedInt.get(i);

            if(left != right) {
                result = false;
            }

        }

        Assert.assertTrue(result);

    }

    @Test
    public void ShouldReturnParsedStringWithGapsBetween() {

        ArrayParser parser = new ArrayParser();

        Array actual = parser.parse("10    222 31  -965");
        Array expected = new Array(10, 222, 31, -965);

        List<Integer> actualInt = actual.getElements();
        List<Integer> expectedInt = expected.getElements();

        boolean result = true;

        for(int i = 0; i < actualInt.size(); i++) {

            int left = actualInt.get(i);
            int right = expectedInt.get(i);

            if(left != right){
                result = false;
            }

        }

        Assert.assertTrue(result);

    }

    @Test
    public void ShouldReturnParsedStringWithGapsBegging() {

        ArrayParser parser = new ArrayParser();

        Array actual = parser.parse("   -98 25 3 -90");
        Array expected = new Array(-98, 25, 3, -90);

        List<Integer> actualInt = actual.getElements();
        List<Integer> expectedInt = expected.getElements();

        boolean result = true;

        for(int i = 0; i < actualInt.size(); i++) {

            int left = actualInt.get(i);
            int right = expectedInt.get(i);

            if(left != right) {
                result = false;
            }

        }

        Assert.assertTrue(result);

    }

    @Test
    public void ShouldReturnParsedStringWithGapsBetweenAndBegging() {

        ArrayParser parser = new ArrayParser();

        Array actual = parser.parse("  100  -20  -3    -9");
        Array expected = new Array(100, -20, -3, -9);

        List<Integer> actualInt = actual.getElements();
        List<Integer> expectedInt = expected.getElements();

        boolean result = true;

        for(int i = 0; i < actualInt.size(); i++) {

            int left = actualInt.get(i);
            int right = expectedInt.get(i);

            if(left != right) {
                result = false;
            }

        }

        Assert.assertTrue(result);

    }

}
