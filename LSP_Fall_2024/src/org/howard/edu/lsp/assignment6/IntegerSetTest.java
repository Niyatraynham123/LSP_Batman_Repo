package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;


public class IntegerSetTest {

    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    public void setup() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set1.add(1);
        set1.add(2);
        set1.clear();
        assertTrue(set1.isEmpty(), "Set should be empty after clear");
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(0, set1.length(), "Empty set should have length 0");
        set1.add(1);
        assertEquals(1, set1.length(), "Set with one element should have length 1");
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2), "Sets should be equal even if elements are in different order");
        
        set2.add(3);
        assertFalse(set1.equals(set2), "Sets should not be equal if they contain different elements");
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        set1.add(1);
        assertTrue(set1.contains(1), "Set should contain added element");
        assertFalse(set1.contains(2), "Set should not contain element not added");
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(3, set1.largest(), "Largest element should be 3");

        IntegerSet emptySet = new IntegerSet();
        assertThrows(NoSuchElementException.class, emptySet::largest, "Should throw exception for empty set");
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(1, set1.smallest(), "Smallest element should be 1");

        IntegerSet emptySet = new IntegerSet();
        assertThrows(NoSuchElementException.class, emptySet::smallest, "Should throw exception for empty set");
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        set1.add(1);
        assertTrue(set1.contains(1), "Set should contain element after add");
        set1.add(1);
        assertEquals(1, set1.length(), "Set should not add duplicate elements");
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set1.add(1);
        set1.add(2);
        set1.remove(1);
        assertFalse(set1.contains(1), "Set should not contain element after removal");
        set1.remove(3); // Removing an element not in the set
        assertEquals(1, set1.length(), "Length should not change when removing non-existent element");
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.union(set2);
        assertTrue(set1.contains(1) && set1.contains(2) && set1.contains(3), "Union should contain all unique elements from both sets");
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2), "Intersection should contain only common elements");
        assertFalse(set1.contains(1) || set1.contains(3), "Intersection should not contain elements not in both sets");
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.diff(set2);
        assertTrue(set1.contains(1), "Difference should contain elements in set1 not in set2");
        assertFalse(set1.contains(2) || set1.contains(3), "Difference should not contain elements in set2");
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        set1.add(1);
        set1.add(2);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set1.complement(set2);
        assertTrue(set1.contains(3) && set1.contains(4), "Complement should contain elements in set2 not in set1");
        assertFalse(set1.contains(1) || set1.contains(2), "Complement should not contain elements in set1");
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(set1.isEmpty(), "New set should be empty");
        set1.add(1);
        assertFalse(set1.isEmpty(), "Set should not be empty after adding element");
        set1.clear();
        assertTrue(set1.isEmpty(), "Set should be empty after clear");
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        set1.add(1);
        set1.add(2);
        assertEquals("[1, 2]", set1.toString(), "toString should display elements correctly");
    }
}

