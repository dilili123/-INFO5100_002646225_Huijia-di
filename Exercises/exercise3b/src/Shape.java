import java.io.Serializable;


public abstract class Shape implements Serializable {
    private static final long serialVersionUID = 1L;
    //
    static String color;

    // 
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
