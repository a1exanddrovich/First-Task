package com.epam.task.first.creator;

import com.epam.task.first.creator.utilities.Cleaner;
import com.epam.task.first.entities.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayParser {

    public Array parse(String data) {

        Cleaner cleaner = new Cleaner();

        //first make the data be free of extra spaces to perform it easily

        String clearedData = cleaner.clean(data);

        List<Integer> array = new ArrayList<Integer>();

        final char[] charsData = clearedData.toCharArray();

        for(int i = 0, space = 0; i < clearedData.length(); i++) {

            if(charsData[i] == ' ' || charsData[i] == '\n') {

                String number = new String();

                for(int j = space; j < i; j++) {
                    number += charsData[j];
                }

                array.add(Integer.parseInt(number));

                space = i + 1;

            }

        }

        Array parsedData = new Array(array);

        return parsedData;

    }

}
