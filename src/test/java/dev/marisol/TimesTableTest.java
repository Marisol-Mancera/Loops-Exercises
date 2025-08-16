package dev.marisol;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class TimesTableTest {

    @Test
    public void shouldReturnTenLines_WhenInputIsFive(){
        TimesTable timesTable = new TimesTable(); //objeto

        ArrayList<String> result = timesTable.lines(5); //llamada al metodo

        assertEquals(10, result.size()); //verificacion de que el resultado es correcto
        assertEquals("5 x 1 = 5", result.get(0)); //verificacion de la primera linea
        assertEquals("5 x 10 = 50", result.get(9)); //ver

    }
    
}
