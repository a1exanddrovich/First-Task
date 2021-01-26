package com.epam.task.first.logic.sort;

import com.epam.task.first.entities.Array;

import java.util.List;

public class SelectionSort implements ArraySort{

    public Array sort(Array array) {

        List<Integer> list = array.getElements();

        int size = list.size();

        int[] arrayInt = new int[size];

        for(int i = 0; i < size; i++) {
            arrayInt[i] = list.get(i);
        }

        for(int i = 0; i < size - 1; i++) {

            int indexMin = i;

            for(int j = i + 1; j < size; j++) {
                if (arrayInt[indexMin] > arrayInt[j]) {
                    indexMin = j;
                }
            }

            if(indexMin != i) {
                int temp = arrayInt[indexMin];
                arrayInt[indexMin] = arrayInt[i];
                arrayInt[i] = temp;
            }

        }

        list.removeAll(list);

        for(int i = 0; i < size; i++) {
            list.add(arrayInt[i]);
        }

        return new Array(list);

    }

}
