package com.epam.task.first.logic.sort.factory;

import com.epam.task.first.logic.sort.*;

public class SortFactory {

    public ArraySort create(SortTypes type) {

        switch (type) {

            case BUBBLE_SORT:
                return new BubbleSort();

            case INSERTION_SORT:
                return new InsertionSort();

            case SELECTION_SORT:
                return new SelectionSort();

            default:
                throw  new IllegalArgumentException("Unknown type: " + type);
        }

    }

}
