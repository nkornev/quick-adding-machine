package com.kornevs.nick.adding_machine;

import java.util.*;

/**
 * Created by nick on 7/29/15.
 *
 * Log class
 */
public class Log {

    private List<NumberEntry> entries;

    public Log() {
        this.entries = new ArrayList<>(50);
    }

    public void addEntry(NumberEntry entry) {
        this.entries.add(entry);
    }

    public void removeEntry(int index) {
        this.entries.remove(index);
    }

    public void removeEntry(int index, boolean recalculate) {
        this.entries.remove(index);
        if (recalculate) {
            this.recalculateSubTotals();
        }
    }

    public void recalculateSubTotals() {
        Iterator<NumberEntry> iterator = this.entries.iterator();
        double subTotal = 0;

        while (iterator.hasNext()) {
            NumberEntry entry = iterator.next();
            subTotal += entry.getEntry();
            entry.setSubTotal(subTotal);
        }
    }

    public double getTotal() {
        return this.entries.get(this.entries.size() - 1).getSubTotal();
    }
}
