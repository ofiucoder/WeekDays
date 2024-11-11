package dev.ofiucoder.weekdays;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;


import static  
 org.junit.jupiter.api.Assertions.*; 

public class HandlerWeekDaysTest {
    
    private final HandlerWeekDays handlerWeekDays = new HandlerWeekDays();

    @Test
    public void testCreateList() {
        List<String> days = handlerWeekDays.getDays();
        assertEquals(7, days.size());
        assertTrue(days.contains("Lunes"));
        assertTrue(days.contains("Viernes"));
        assertTrue(days.contains("Domingo"));
    }

    @Test
    public void testGetNumberOfDays() {
        assertEquals(7, handlerWeekDays.getNumberOfDays());
    }

    @Test
    public void testRemoveDay() {
        handlerWeekDays.removeDay("Lunes");
        assertEquals(6, handlerWeekDays.getNumberOfDays());
        assertFalse(handlerWeekDays.containsDay("Lunes"));
    }

    @Test
    public void testGetDay() {
        assertEquals("Miércoles", handlerWeekDays.getDay(2));
        assertThrows(IndexOutOfBoundsException.class, () -> handlerWeekDays.getDay(10));
    }

    @Test
    public void testContainsDay() {
        assertTrue(handlerWeekDays.containsDay("Viernes"));
        assertFalse(handlerWeekDays.containsDay("Foobar"));
    }

    @Test
    public void testSortDaysAlphabetically() {
        handlerWeekDays.sortDaysAlphabetically();
        assertEquals("Viernes", handlerWeekDays.getDay(6));
        assertEquals("Domingo", handlerWeekDays.getDay(0));
    }

    @Test
    public void testClearDays() {
        handlerWeekDays.clearDays();
        assertEquals(0, handlerWeekDays.getNumberOfDays());
    }
}
