package com.epam.task.first;

import com.epam.task.first.logic.ArrayLogic;
import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayLogicTest {

    private ArrayLogic arrayLogic = new ArrayLogic();

    @Test
    public void testFindMaxShouldFindMaxWhenPositiveNumbersApplied() {
        //given
        Array array = new Array(1, 3, 2);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testFindMaxShouldFindMaxWhenNegativeNumbersApplied() {
        //given
        Array array = new Array(-1, -3, -2);

        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(-1, actual);
    }

    @Test
    public void testFindMinShouldFindMin() {
        //given
        Array array = new Array(-1, -3, -2);

        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(-3, actual);
    }

    @Test
    public void testReplaceWithNullIfPositiveNumberShouldReplaceNumberWithNullIfPositiveNumberMeet() {

        Array array = new Array(1, -3, -5, 8);
        Array array2 = new Array(0, -3, -5, 0);

        Array processedArray = arrayLogic.replaceWithNullIfPositiveNumber(array);

        boolean isPerformed = true;

        List<Integer> elements = array2.getElements();
        List<Integer> processedElements = processedArray.getElements();

        for(int i = 0; i < processedElements.size(); i++) {

            if(processedElements.get(i) != elements.get(i)) {
                isPerformed = false;
            }

        }

        Assert.assertTrue(isPerformed);

    }

    @Test
    public void testReplaceWithNullIfPositiveNumberShouldReplaceNumberWithNullIfPositiveNumberMeetPositiveOnlyVersion() {

        Array array = new Array(21, 11, 76, 97);
        Array array2 = new Array(0, 0, 0, 0);

        Array processedArray = arrayLogic.replaceWithNullIfPositiveNumber(array);

        boolean isPerformed = true;

        List<Integer> elements = array2.getElements();
        List<Integer> processedElements = processedArray.getElements();

        for(int i = 0; i < processedElements.size(); i++) {

            if(processedElements.get(i) != elements.get(i)) {
                isPerformed = false;
            }

        }

        Assert.assertTrue(isPerformed);

    }

    @Test
    public void testReplaceWithNullIfPositiveNumberShouldReplaceNumberWithNullIfPositiveNumberMeetNegativeOnlyVersion() {

        Array array = new Array(-19, -23, -45, -66);
        Array array2 = new Array(-19, -23, -45, -66);

        Array processedArray = arrayLogic.replaceWithNullIfPositiveNumber(array);

        boolean isPerformed = true;

        List<Integer> elements = array2.getElements();
        List<Integer> processedElements = processedArray.getElements();

        for(int i = 0; i < processedElements.size(); i++) {

            if(processedElements.get(i) != elements.get(i)) {
                isPerformed = false;
            }

        }

        Assert.assertTrue(isPerformed);

    }

    @Test
    public void testGetAverageNumberShouldReturnAverageNumberWhenPositiveNumbersGiven() {

        Array array = new Array(1, 7, 2);

        int actual = arrayLogic.getAverageNumber(array);

        Assert.assertEquals(3, actual);

    }

    @Test
    public void testGetAverageNumberShouldReturnAverageNumberWhenNegativeNumbersGiven() {

        Array array = new Array(-1, -2, -3);

        int actual = arrayLogic.getAverageNumber(array);

        Assert.assertEquals(-2, actual);

    }

    @Test
    public void testGetAverageNumberShouldReturnAverageNumberWhenMultipleNumbersGiven() {

        Array array = new Array(6, -2, 8, -4);

        int actual = arrayLogic.getAverageNumber(array);

        Assert.assertEquals(2, actual);

    }

    @Test
    public void testGetSumShouldReturnSumWhenPositiveNumbersGiven() {

        Array array = new Array(1, 2, 3, 4, 5);

        int actual = arrayLogic.getSum(array);

        Assert.assertEquals(15, actual);

    }

    @Test
    public void testGetSumShouldReturnSumWhenNegativeNumbersGiven() {

        Array array = new Array(-1, -3, -7, -4, -55);

        int actual = arrayLogic.getSum(array);

        Assert.assertEquals(-70, actual);

    }

    @Test
    public void testGetSumShouldReturnSumWhenMultipleNumbersGiven() {

        Array array = new Array(-1, 3, -7, 4, -5, 6);

        int actual = arrayLogic.getSum(array);

        Assert.assertEquals(0, actual);

    }

    @Test
    public void testGetCountOfPositiveNumbersShouldReturnCountOfPositiveNumbers() {

        Array array = new Array(-1, 3, 7, -4, -55);

        int actual = arrayLogic.getCountOfPositiveNumbers(array);

        Assert.assertEquals(2, actual);

    }

    @Test
    public void testGetCountOfNegativeNumbersShouldReturnCountOfNegativeNumbers() {

        Array array = new Array(-1, 3, 7, -4, -55);

        int actual = arrayLogic.getCountOfNegativeNumbers(array);

        Assert.assertEquals(3, actual);

    }


}

