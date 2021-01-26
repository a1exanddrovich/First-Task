package com.epam.task.first.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<String> readData(String fileName) throws DataException {

        List<String> result = new ArrayList<String>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = reader.readLine()) != null) {

                result.add(line);

            }

        } catch (IOException e) {

            throw new DataException("The specified file not found", e);

        }

        return result;

    }

}
