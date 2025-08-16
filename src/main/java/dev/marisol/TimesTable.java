package dev.marisol;

import java.util.ArrayList;

public class TimesTable {

public ArrayList<String> lines(int number) {

        return generate(number);
    }

    public ArrayList<String> generate(int number) {
        
    ArrayList<String> lines = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            lines.add(number + " x " + i + " = " + (number * i));
        }
        return lines;
    }
    
}