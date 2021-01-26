package com.epam.task.first.creator;

import org.junit.Assert;
import org.junit.Test;

public class ArrayValidatorTest {

    static ArrayValidator validator = new ArrayValidator();

    @Test
    public void ShouldReturnFalse() {

        boolean actual = validator.validate("1 2 3 4 5 6e");

        Assert.assertFalse(actual);

    }

    @Test
    public void ShouldReturnTrue() {

        boolean actual = validator.validate("23 45 -90 98");

        Assert.assertTrue(actual);

    }

}
