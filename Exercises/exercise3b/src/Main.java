import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 
        Shape shape1 = new Circle(5);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("circle.ser"))) {
            out.writeObject(shape1);
            System.out.println("Circle object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("circle.ser"))) {
            Circle savedCircle = (Circle) in.readObject();
            System.out.println("Circle object deserialized successfully.");
            System.out.println("Area: " + savedCircle.calculateArea());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 
        Shape shape2 = new Rectangle(7, 8);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("rectangle.ser"))) {
            out.writeObject(shape2);
            System.out.println("Rectangle object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("rectangle.ser"))) {
            Rectangle savedRectangle = (Rectangle) in.readObject();
            System.out.println("Rectangle object deserialized successfully.");
            System.out.println("Area: " + savedRectangle.calculateArea());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 
        Shape shape3 = new Triangle(4, 3, 2, 6, 2);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("triangle.ser"))) {
            out.writeObject(shape3);
            System.out.println("Triangle object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("triangle.ser"))) {
            Triangle savedTriangle = (Triangle) in.readObject();
            System.out.println("Triangle object deserialized successfully.");
            System.out.println("Area: " + savedTriangle.calculateArea());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 
        Shape shape4 = new Square(8);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("square.ser"))) {
            out.writeObject(shape4);
            System.out.println("Square object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("square.ser"))) {
            Square savedSquare = (Square) in.readObject();
            System.out.println("Square object deserialized successfully.");
            System.out.println("Area: " + savedSquare.calculateArea());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //
        System.out.println("Circle's Area: " + shape1.calculateArea());
        System.out.println("Rectangle's Perimeter: " + shape2.calculatePerimeter());
        System.out.println("Triangle's Area: " + shape3.calculateArea());
        System.out.println("Square's Perimeter: " + shape4.calculatePerimeter());
    }
}
