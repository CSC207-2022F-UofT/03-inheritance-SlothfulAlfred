/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;

    Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new String[capacity];
    }

    public String getColor() {
        return this.color;
    }

    public int getNumberOfContents() {
        return this.numberOfContents;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setColor(String s) {
        this.color = s;
    }

    /**
     * Adds a given item to the Bad if there is room.
     *
     * @param item the item to be added
     * @return true if the item was added and false otherwise
     */
    public boolean addItem(String item) {
        if (numberOfContents < capacity) {
            contents[numberOfContents] = item;
            numberOfContents++;
            return true;
        } else {
            return false;
        }
    }





    /**
     * Returns the last item added to this Bad and removes it.
     *
     * @return The last item added to this Bad, or null if this Bag is empty
     */
    public String popItem() {
        if (contents.length == 0) {
            return null;
        }
        numberOfContents--;
        return contents[numberOfContents];
    }





    /**
     * Increase this bag's capacity by a positive integer n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        capacity += n;
        String[] new_contents = new String[capacity];
        System.arraycopy(contents, 0, new_contents, 0, contents.length);
        this.contents = new_contents;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}