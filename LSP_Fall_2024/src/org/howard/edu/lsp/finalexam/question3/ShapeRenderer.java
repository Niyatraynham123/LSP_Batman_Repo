package org.howard.edu.lsp.finalexam.question3;

/**
 * The ShapeRenderer class that renders shapes using the Factory pattern.
 * The class is refactored to use a ShapeFactory singleton for shape creation.
 */
public class ShapeRenderer {
    private ShapeFactory shapeFactory = ShapeFactory.getInstance();

    /**
     * Renders a shape by delegating to the ShapeFactory.
     * @param shapeType The type of shape to render.
     */
    public void renderShape(String shapeType) {
        Shape shape = shapeFactory.createShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon  
    }
}
