public class Pen {
    // 
    private String color;
    private String brand;
    private int year;
    private String model;
    private double price;
    private String inkColor;
    private double inkCapacity; 
    private boolean isOn; 

    //造函数
    public Pen(String color, String brand, int year, String model, double price, String inkColor, double inkCapacity) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.price = price;
        this.inkColor = inkColor;
        this.inkCapacity = inkCapacity;
        this.isOn = false; 
        System.out.println("This is a Pen: " + brand + " " + model + " (" + inkColor + ")");
    }

    // 
    public void openCap() {
        this.isOn = true;
        System.out.println("The cap of " + model + " pen is opened.");
    }

    public void closeCap() {
        this.isOn = false;
        System.out.println("The cap of " + model + " pen is closed.");
    }

    public void write(String text) {
        if (this.isOn) {
            System.out.println("Writing with the " + model + ": " + text);
        } else {
            System.out.println("Please open the cap of the pen first.");
        }
    }

    // 
    public static class Refill {
        private String inkType; 
        private double size;

        public Refill(String inkType, double size) {
            this.inkType = inkType;
            this.size = size;
            System.out.println("Refill installed: " + inkType + " ink, " + size + "ml");
        }

        public void replaceInk(double newSize) {
            this.size = newSize;
            System.out.println("Replaced ink with size: " + newSize + "ml.");
        }
    }

    // 
    public static class Clip {
        private String material; 

        public Clip(String material) {
            this.material = material;
            System.out.println("Clip material: " + material);
        }

        public void attachToPocket() {
            System.out.println("Attaching pen to pocket with " + material + " clip.");
        }
    }
}
