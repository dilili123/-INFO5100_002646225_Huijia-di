abstract class Shape {
    static String color = "Red";

    abstract double calculateArea();
    abstract double calculatePerimeter();

    public static String getColor() {
        return color;
    }
}
