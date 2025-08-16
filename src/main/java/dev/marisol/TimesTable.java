package dev.marisol;

import java.util.List;

public class TimesTable {

public List<String> lines(int number) {

        return generate(number);
    }

    public List<String> generate(int number) {
        
        return List.of(
            "1 x " + number + " = " + (1 * number),
            "2 x " + number + " = " + (2 * number),
            "3 x " + number + " = " + (3 * number),
            "4 x " + number + " = " + (4 * number),
            "5 x " + number + " = " + (5 * number),
            "6 x " + number + " = " + (6 * number),
            "7 x " + number + " = " + (7 * number),
            "8 x " + number + " = " + (8 * number),
            "9 x " + number + " = " + (9 * number),
            "10 x " + number + " = " + (10 * number)
        );
    }
    
}