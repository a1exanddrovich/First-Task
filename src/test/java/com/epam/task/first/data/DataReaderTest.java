package com.epam.task.first.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {

    private final static String TEST_DATA = "src/test.txt";

    @Test
    public void ShouldReadDataFromFile() throws DataException{

        DataReader reader = new DataReader();

        List<String> actual = reader.readData(TEST_DATA);

        List<String> expected = new ArrayList<String>();

        expected.add("  100  -20  -3    -9");

        boolean result = false;

        for(int i = 0; i < actual.size(); i++) {

            String left = actual.get(i);
            String right = expected.get(i);

            if(left.equals(right)) {
                result = true;
            }

        }

        Assert.assertTrue(result);

    }

}
