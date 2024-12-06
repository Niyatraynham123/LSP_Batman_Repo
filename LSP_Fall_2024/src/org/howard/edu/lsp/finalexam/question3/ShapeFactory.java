package org.howard.edu.lsp.finalexam.question3;

/**
 * Singleton factory class for creating shapes.
 */
public class ShapeFactory {
    private static ShapeFactory instance;

    // Private constructor to prevent instantiation
    private ShapeFactory() {}

    /**
     * Returns the singleton instance of ShapeFactory.
     */
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    /**
     * Creates a shape based on the shapeType.
     * @param shapeType The type of shape to create.
     * @return A Shape object, or null if the shape type is unknown.
     */
    public Shape createShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}
