import java.io.Serializable;

public class Rectangle extends Shape implements Serializable {
    private static final long serialVersionUID = 1L; 
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    


    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
