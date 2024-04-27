public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Triangle(3, 5, 7);
        shapes[3] = new Square(5);  

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape + ", Area: " + shape.calculateArea() + ", Perimeter: " + shape.calculatePerimeter() + ", Color: " + shape.getColor());
        }
    }
}
