class Shape {
    public int sides = 4;
    public String color = "Red";
    public char type = 'R'; // R = Rectangle, C = Circle, T = Triangle, S = Square
    public boolean isFilled = true;
    public float area = 20.5f; // in square units
    public double perimeter = 18.75;
    public long shapeId = 1010L;

    public void displayShape() {
        System.out.println("Sides: " + sides);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Is Filled: " + isFilled);
        System.out.println("Area: " + area + " sq units");
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Shape ID: " + shapeId);
    }
}
