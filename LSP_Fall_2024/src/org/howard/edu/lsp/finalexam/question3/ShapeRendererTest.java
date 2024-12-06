package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for the refactored ShapeRenderer class using the Factory Pattern.
 */
public class ShapeRendererTest {

    ShapeRenderer renderer = new ShapeRenderer();

    @Test
    public void testRenderCircle() {
        // Capture system output to test the result
        final java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        renderer.renderShape("circle");
        assertEquals("Drawing a Circle\n", outContent.toString());
    }

    @Test
    public void testRenderRectangle() {
        final java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        renderer.renderShape("rectangle");
        assertEquals("Drawing a Rectangle\n", outContent.toString());
    }

    @Test
    public void testRenderTriangle() {
        final java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        renderer.renderShape("triangle");
        assertEquals("Drawing a Triangle\n", outContent.toString());
    }

    @Test
    public void testRenderUnknownShape() {
        final java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        renderer.renderShape("hexagon");
        assertEquals("Unknown shape type: hexagon\n", outContent.toString());
    }
}
