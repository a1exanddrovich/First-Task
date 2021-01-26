package com.epam.task.first;

import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {

    private final ArrayValidator validator;
    private final ArrayParser parser;
    private final DataReader reader;

    public ArrayCreator(ArrayValidator validator, ArrayParser parser, DataReader reader) {
        this.validator = validator;
        this.parser = parser;
        this.reader = reader;
    }

    public List<Array> create(String fileName) throws DataException{

        List<String> lines = reader.readData(fileName);

        List<Array> processedArray = new ArrayList<Array>();

        int i = 0;

        while(i < lines.size()) {

            String currentLine = lines.get(i);
            i++;

            if(validator.validate(currentLine)) {
                Array parsedLine = parser.parse(currentLine);
                processedArray.add(parsedLine);
            }

        }

        return processedArray;

    }

}
