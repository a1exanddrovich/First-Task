package com.epam.task.first.logic.sort;

import com.epam.task.first.entities.Array;

import java.util.List;

public class InsertionSort implements ArraySort {

    public Array sort(Array array) {

        List<Integer> list = array.getElements();

        int size = list.size();

        int[] arrayInt = new int[size];

        for(int i = 0; i < size; i++) {
            arrayInt[i] = list.get(i);
        }

        for(int i = 1; i < size; i++) {
            for(int j = i; arrayInt[j - 1] > arrayInt[j] && j > 0; j--) {
                int temp = arrayInt[j - 1];
                arrayInt[j - 1] = arrayInt[j];
                arrayInt[j] = temp;
            }
        }

        list.removeAll(list);

        for(int i = 0; i < size; i++) {
            list.add(arrayInt[i]);
        }

        return new Array(list);

    }

}
