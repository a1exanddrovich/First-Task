package com.epam.task.first;

import com.epam.task.first.creator.ArrayParser;
import com.epam.task.first.creator.ArrayValidator;
import com.epam.task.first.data.DataException;
import com.epam.task.first.data.DataReader;
import com.epam.task.first.entities.Array;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class ArrayCreatorTest {

    private final static String FILENAME = "src/test.txt";
    private final static List<String> TEST_DATA = Arrays.asList("  2  3 4 65");

    @Test
    public void testProcess() throws DataException, FileNotFoundException {

        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readData(anyString())).thenReturn(TEST_DATA);

        ArrayValidator validator = Mockito.mock(ArrayValidator.class);
        when(validator.validate(anyString())).thenReturn(true);

        ArrayParser parser = new ArrayParser();

        ArrayCreator creator = new ArrayCreator(validator, parser, reader);

        List<Array> actual = creator.create(FILENAME);

        Array expected = new Array(2, 3, 4, 65);

        boolean res = true;

        List<Integer> actualInt = actual.get(0).getElements();

        List<Integer> expectedInt = expected.getElements();

        for(int i = 0; i < actualInt.size(); i++) {

            int left = actualInt.get(i);
            int right = expectedInt.get(i);

            if(left != right) {
                res = false;
            }

        }

        Assert.assertTrue(res);

    }



}
