package dev.ofiucoder.weekdays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandlerWeekDays {

    public List<String> days;

    public HandlerWeekDays() {
        createList();
    }

    public List<String> getDays() {
        return days;
    }

    public void setDays(List<String> days) {
        this.days = days;
    }

    public void createList() {
        days = new ArrayList<String>();
        days.add("Lunes");
        days.add("Martes");
        days.add("Miércoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sábado");
        days.add("Domingo");
    }

    public int getNumberOfDays() {
        return days.size();
    }

    public void removeDay(String day) {
        days.remove(day);
    }

    public String getDay(int index) {
        if (index >= 0 && index < days.size()) {
            return (days.get(index));
        } else {
            throw new IndexOutOfBoundsException("Indice invalido");
        }

    }

    public boolean containsDay(String day) {
        return days.contains(day);

    }

    public void sortDaysAlphabetically() {
        Collections.sort(days);
    }

    public void clearDays() {
        days.clear();
    }

}
