package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a set of integers with various operations.
 */
public class IntegerSet {

    private List<Integer> set;

    /**
     * Default constructor initializing an empty set.
     */
    public IntegerSet() {
        this.set = new ArrayList<>();
    }

    /**
     * Parameterized constructor initializing the set with a given list.
     *
     * @param set the list of integers to initialize the set.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>(set);
    }

    /**
     * Clears all elements from the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the size of the set.
     *
     * @return the number of elements in the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if this set is equal to another set.
     * Two sets are considered equal if they contain the same elements, regardless of order.
     *
     * @param obj the object to compare.
     * @return true if the sets are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IntegerSet otherSet = (IntegerSet) obj;
        return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
    }

    /**
     * Checks if the set contains a specific value.
     *
     * @param value the value to check.
     * @return true if the value is in the set, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Finds the largest element in the set.
     *
     * @return the largest value.
     * @throws Exception if the set is empty.
     */
    public int largest() throws Exception {
        if (set.isEmpty()) {
            throw new Exception("Set cannot be empty");
        }
        return Collections.max(set);
    }

    /**
     * Finds the smallest element in the set.
     *
     * @return the smallest value.
     * @throws Exception if the set is empty.
     */
    public int smallest() throws Exception {
        if (set.isEmpty()) {
            throw new Exception("Set cannot be empty");
        }
        return Collections.min(set);
    }

    /**
     * Adds an element to the set if it is not already present.
     *
     * @param item the value to add.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an element from the set.
     *
     * @param item the value to remove.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs the union of this set with another set.
     *
     * @param otherSet the set to union with.
     */
    public void union(IntegerSet otherSet) {
        for (int value : otherSet.set) {
            if (!set.contains(value)) {
                set.add(value);
            }
        }
    }

    /**
     * Performs the intersection of this set with another set.
     *
     * @param otherSet the set to intersect with.
     */
    public void intersect(IntegerSet otherSet) {
        set.retainAll(otherSet.set);
    }

    /**
     * Removes all elements of another set from this set.
     *
     * @param otherSet the set whose elements will be removed.
     */
    public void diff(IntegerSet otherSet) {
        set.removeAll(otherSet.set);
    }

    /**
     * Replaces the current set with the complement relative to another set.
     *
     * @param otherSet the reference set for complement operation.
     */
    public void complement(IntegerSet otherSet) {
        List<Integer> complementSet = new ArrayList<>();
        for (int item : otherSet.set) {
            if (!set.contains(item)) {
                complementSet.add(item);
            }
        }
        set = complementSet;
    }

    /**
     * Checks if the set is empty.
     *
     * @return true if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     *
     * @return a string representation of the set.
     */
    @Override
    public String toString() {
        return "{" + String.join(", ", set.stream().map(String::valueOf).toArray(String[]::new)) + "}";
    }
}
