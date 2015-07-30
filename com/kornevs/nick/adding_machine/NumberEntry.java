package com.kornevs.nick.adding_machine;

/**
 * Created by nick on 7/29/15.
 *
 * NumberEntry class
 */
public class NumberEntry {

    private double entry;

    private double subTotal;

    public NumberEntry() {
        this.entry = 0;
        this.subTotal = 0;
    }

    public NumberEntry(double entry, double subTotal) {
        this.entry = entry;
        this.subTotal = subTotal;
    }

    public NumberEntry(NumberEntry numberEntry) {
        this.entry = numberEntry.getEntry();
        this.subTotal = numberEntry.getSubTotal();
    }

    public void setEntry(double entry) {
        this.entry = entry;
    }

    public double getEntry() {
        return this.entry;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getSubTotal() {
        return this.subTotal;
    }

    public String toString() {
        return "Entry: "+String.valueOf(this.entry)+" | Sub-total: "+String.valueOf(this.subTotal);
    }
}
