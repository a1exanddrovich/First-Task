package com.epam.task.first.creator;

public class ArrayValidator {

    //the function vets line in char-by-char way

    public boolean validate(String line) {

        for(int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);

            if(symbol == ' ' || symbol == '-') {
                continue;
            }

            if(symbol < 48 || symbol > 58) {
                return false;
            }
        }

        return true;

    }

}
