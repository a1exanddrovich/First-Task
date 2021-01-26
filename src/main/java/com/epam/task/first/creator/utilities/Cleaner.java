package com.epam.task.first.creator.utilities;

//the function performs getting rif of double,triple exc. gaps between symbols

public class Cleaner {

    public String clean(String line) {

        line += '\n';

        int length = line.length();

        String processedLine = new String();

        final char[] charsData = line.toCharArray();

        for(int i = 0; i < length; i++) {

            if(charsData[i] == ' ') {
                continue;
            }

            while(charsData[i] != ' ' && charsData[i] != '\n') {
                processedLine += charsData[i];
                i++;
            }

            if(i != length - 1) {
                processedLine += ' ';
            }

        }

        processedLine += '\n';

        return processedLine;

    }

}
