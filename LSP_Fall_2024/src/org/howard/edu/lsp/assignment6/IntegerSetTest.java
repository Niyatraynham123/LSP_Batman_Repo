package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerSetTest {
	
	private IntegerSet setA;
	private IntegerSet setB;
	
	@BeforeEach
	public void setUp() {
		setA = new IntegerSet();
		setB = new IntegerSet();
	}
	
	@Test
    @DisplayName("Test case for clear")
	public void testClear() {
		setA.add(2);
		setB.add(3);
		
		setA.clear();
		setB.clear();
		
		assertTrue(setA.isEmpty());
		assertTrue(setB.isEmpty());
	}
	
	@Test
    @DisplayName("Test case for length")
	public void testLength() {
		assertEquals(0, setA.length());
		assertEquals(0, setB.length());
		
		setA.add(1);
		setA.add(2);
		
		setB.add(1);
		setB.add(2);
		
		assertEquals(2, setA.length());
		assertEquals(2, setB.length());
	}
	
	@Test
    @DisplayName("Test case for equals")
	public void testEquals() {	
		assertTrue(setA.equals(setB));
		
		setA.add(1);
		setA.add(2);
		
		setB.add(1);
		setB.add(2);
		
		assertTrue(setA.equals(setB));
		
		setA.add(3);
		
		assertFalse(setA.equals(setB));
	}
	
	@Test
    @DisplayName("Test case for contains")
	public void testContains() {	
		setA.add(1);
		setB.add(2);
		
		assertTrue(setA.contains(1));
		assertFalse(setA.contains(0));
		assertTrue(setB.contains(2));
	}
	
	@Test
    @DisplayName("Test case for largest item in the set")
	public void testLargest() {	
		setA.add(1);
		setA.add(2);
		setA.add(7);
		
		setB.add(2);
		setB.add(3);
		
		assertEquals(7, setA.largest());
		assertEquals(3, setB.largest());
		
		setA.clear();
		setB.clear();
		
		assertThrows(Exception.class, () -> {
			setA.largest();
		});
		
		assertThrows(Exception.class, () -> {
			setB.largest();
		});
	}
	
	@Test
    @DisplayName("Test case for smallest item in the set")
	public void testSmallest() {	
		setA.add(1);
		setA.add(2);
		setA.add(7);
		
		setB.add(2);
		setB.add(3);
		
		assertEquals(1, setA.smallest());
		assertEquals(2, setB.smallest());
		
		setA.clear();
		setB.clear();
		
		assertThrows(Exception.class, () -> {
			setA.smallest();
		});
		
		assertThrows(Exception.class, () -> {
			setB.smallest();
		});
	}
	
	@Test
    @DisplayName("Test case for add")
	public void testAdd() {
        setA.add(1);
        setB.add(1); 
        
        assertEquals(1, setA.length());
        assertEquals(1, setB.length());
        
        setA.add(1);
        setB.add(1);
        
        assertEquals(1, setA.length());
        assertEquals(1, setB.length());
    }
	
	@Test
    @DisplayName("Test case for remove")
	public void testRemove() {
        setA.add(1);
        setB.add(1); 
        
        setA.remove(1);
        setB.remove(1);
        
        assertEquals(0, setA.length());
        assertEquals(0, setB.length());
        assertFalse(setA.contains(1));
        assertFalse(setB.contains(1));
        
        setA.remove(5);
        assertEquals(0, setA.length());
    }
	
	@Test
    @DisplayName("Test case for union")
	public void testUnion() {
        setA.add(1);
        setA.add(2);
        setA.add(3);

        setB.add(4);
        setB.add(5);
        setB.add(6);
        
        setA.union(setB);
        
        assertEquals(6, setA.length());
        assertTrue(setA.contains(1));
        assertTrue(setA.contains(2));
        assertTrue(setA.contains(3));
        assertTrue(setA.contains(4));
        assertTrue(setA.contains(5));
        assertTrue(setA.contains(6));
        
        // Test union with an empty set
        setA.clear();
        setB.clear();
        setB.add(7);
        setA.union(setB);
        
        assertEquals(1, setA.length());
        assertTrue(setA.contains(7));
    }
	
	@Test
    @DisplayName("Test case for intersect")
	public void testIntersect() {
		setA.add(1);
		setA.add(2);
		
		setB.add(2);
		setB.add(3);
		
		setA.intersect(setB);
		assertEquals(1, setA.length());
		assertTrue(setA.contains(2));
		
		setA.clear();
		setB.clear();
		setA.add(1);
		setA.intersect(setB);
		assertTrue(setA.isEmpty());
	}
	
	@Test
    @DisplayName("Test case for difference")
	public void testDifference() {
		setA.add(1);
		setA.add(2);
		setA.add(3);
		
		setB.add(2);
        setB.add(4);
        
        setA.diff(setB);
        
        assertEquals(2, setA.length());
        assertTrue(setA.contains(1));
        assertTrue(setA.contains(3));
        assertFalse(setA.contains(2));
	}
	
	@Test
    @DisplayName("Test case for complement")
	public void testComplement() {
		setA.add(1);
        setA.add(2);
        
        setB.add(2);
        setB.add(3);
        setB.add(4);
        
        setA.complement(setB);
        
        assertEquals(2, setA.length());
        assertTrue(setA.contains(3));
        assertTrue(setA.contains(4));
        
        setA.clear();
        setA.add(5);
        setB.clear();
        setA.complement(setB);
        assertTrue(setA.isEmpty());
	}
	
	@Test
    @DisplayName("Test case for empty")
	public void testIsEmpty() {
		assertTrue(setA.isEmpty());
		
		setA.add(1);
		assertFalse(setA.isEmpty());
	}
	
	@Test
    @DisplayName("Test case for toString")
	public void testToString() {
        setA.add(1);
        setA.add(2);
        assertEquals("{1, 2}", setA.toString());
        
        setA.clear();
        assertEquals("{}", setA.toString());
    }
}
