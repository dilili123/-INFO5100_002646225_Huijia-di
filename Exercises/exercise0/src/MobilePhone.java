public class MobilePhone {
    // 
    private String color;
    private String brand;
    private int year;
    private String model;
    private double price;
    private double screenSize; 
    private double storage; 
    private boolean isOn; 

    // 
    public MobilePhone(String color, String brand, int year, String model, double price, double screenSize, double storage) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
        this.storage = storage;
        this.isOn = false; 
        System.out.println("This a Mobile Phone: " + brand + " " + model + " (" + color + ")");
    }
    // 
    public void powerOn() {
        this.isOn = true;
        System.out.println("The " + model + " mobile phone is turn on.");
    }

    public void powerOff() {
        this.isOn = false;
        System.out.println("The " + model + " mobile phone is turn off.");
    }

    public void call(String number) {
        if (this.isOn) {
            System.out.println("Calling " + number + " from " + model + ".");
        } else {
            System.out.println("Please turn on the phone first.");
        }
    }

    // 
    public static class Camera {
        private double resolution; // 

        public Camera(double resolution) {
            this.resolution = resolution;
            System.out.println("Camera with " + resolution + "MP resolution ready.");
        }

        public void takePhoto() {
            System.out.println("Taking a photo with " + resolution + "MP camera.");
        }
    }

    //
    public static class Battery {
        private int capacity; // 

        public Battery(int capacity) {
            this.capacity = capacity;
            System.out.println("Battery capacity: " + capacity + "mAh.");
        }

        public void chargeBattery() {
            System.out.println("Charging the battery.");
        }
    }
}
