package org.howard.edu.lsp.assignment5;


import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a mathematical set of integers, ensuring there are no duplicates.
 */
public class IntegerSet {

    private List<Integer> set = new ArrayList<Integer>();

    public IntegerSet() {
    }

    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>(set);
    }

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     * @return length of the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if the current set is equal to another set.
     * Two sets are equal if they contain the same elements in any order.
     * @param o Object to compare with
     * @return true if the sets are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet otherSet = (IntegerSet) o;
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
    }

    /**
     * Checks if the set contains a particular value.
     * @param value value to check
     * @return true if the value is in the set, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest value in the set.
     * @return largest integer in the set
     * @throws IllegalStateException if the set is empty
     */
    public int largest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty.");
        return set.stream().max(Integer::compare).get();
    }

    /**
     * Returns the smallest value in the set.
     * @return smallest integer in the set
     * @throws IllegalStateException if the set is empty
     */
    public int smallest() {
        if (set.isEmpty()) throw new IllegalStateException("Set is empty.");
        return set.stream().min(Integer::compare).get();
    }

    /**
     * Adds an item to the set if it's not already present.
     * @param item value to add
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set if it's present.
     * @param item value to remove
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs a union of the current set and another set.
     * @param intSetb another IntegerSet to union with
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Performs an intersection of the current set and another set.
     * Only keeps elements that are in both sets.
     * @param intSetb another IntegerSet to intersect with
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs a difference operation between the current set and another set.
     * Keeps elements that are in the current set but not in the other set.
     * @param intSetb another IntegerSet to subtract from this set
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Performs a complement operation, removes all elements from this set
     * that are in the other set.
     * @param intSetb the other set to compare
     */
    public void complement(IntegerSet intSetb) {
        diff(intSetb);
    }

    /**
     * Checks if the set is empty.
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns the string representation of the set.
     * @return string representation of the set
     */
    @Override
    public String toString() {
        return set.toString();
    }
}

