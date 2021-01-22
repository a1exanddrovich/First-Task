package com.epam.task.first.logic;

import com.epam.task.first.entities.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayLogic {

    public int findMax(Array array) {

        List<Integer> elements = array.getElements();

        if(elements.size() == 0) {

            throw new IllegalArgumentException();

        }

        int max = elements.get(0);

        for(Integer element : elements) {
            if(element > max) {
                max = element;
            }
        }

        return max;

    }

    public int findMin(Array array) {

        List<Integer> elements = array.getElements();

        if(elements.size() == 0) {

            throw new IllegalArgumentException();

        }

        int min = elements.get(0);

        for(Integer element : elements) {
            if(element < min) {
                min = element;
            }
        }

        return min;

    }

    public Array replaceWithNullIfPositiveNumber(Array array) {

        List<Integer> elements = array.getElements();

        if(elements.size() == 0) {

            throw new IllegalArgumentException();

        }

        List<Integer> processedElements = new ArrayList<Integer>();

        for(Integer element : elements) {
            if(element > 0) {
                processedElements.add(0);
            } else {
                processedElements.add(element);
            }
        }

        Array processedArray = new Array(processedElements);

        return processedArray;

    }

    public int getSum(Array array) {

        List<Integer> elements = array.getElements();

        if(elements.size() == 0) {

            throw new IllegalArgumentException();

        }

        int sum = 0;

        for(Integer element : elements) {
            sum += element;
        }

        return sum;

    }

    public int getAverageNumber(Array array) {

        List<Integer> elements = array.getElements();

        if(elements.size() == 0) {

            throw new IllegalArgumentException();

        }

        ArrayLogic arrayLogic = new ArrayLogic();

        int sum = arrayLogic.getSum(array);

        sum /= elements.size();

        return sum;

    }

    public int getCountOfPositiveNumbers(Array array) {

        List<Integer> elements = array.getElements();

        if(elements.size() == 0) {

            throw new IllegalArgumentException();

        }

        int countOfPositiveNumbers = 0;

        for(Integer element : elements) {
            if(element > 0) {
                countOfPositiveNumbers++;
            }
        }

        return countOfPositiveNumbers;

    }

    public int getCountOfNegativeNumbers(Array array) {

        List<Integer> elements = array.getElements();

        if(elements.size() == 0) {

            throw new IllegalArgumentException();

        }

        int countOfNegativeNumbers = 0;

        for(Integer element : elements) {
            if(element < 0) {
                countOfNegativeNumbers++;
            }
        }

        return countOfNegativeNumbers;

    }

}
