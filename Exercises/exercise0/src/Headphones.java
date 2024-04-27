public class Headphones {
    // 
    private String color;
    private String brand;
    private int year;
    private String model;
    private double price;
    private boolean isWireless; 
    private double batteryLife; 
    private double weight; 

    // 
    public Headphones(String color, String brand, int year, String model, double price, boolean isWireless, double batteryLife, double weight) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.price = price;
        this.isWireless = isWireless;
        this.batteryLife = batteryLife;
        this.weight = weight;
        System.out.println("This is a Headphones: " + brand + " " + model + " (" + color + ")");
    }

    // 
    public void turnOn() {
        System.out.println("Turn on the " + model + " headphones.");
    }

    public void turnOff() {
        System.out.println("Turn off the " + model + " headphones.");
    }

    public void pairDevice(String deviceName) {
        if (isWireless) {
            System.out.println("Pairing " + model + " headphones with " + deviceName + ".");
        } else {
            System.out.println("Cannot pair, the headphones are not wireless.");
        }
    }

    // 
    public static class EarPad {
        private String material;
        private String size; 

        public EarPad(String material, String size) {
            this.material = material;
            this.size = size;
            System.out.println("EarPad made of " + material + " in " + size + " size.");
        }

        public void replaceEarPad(String newSize) {
            this.size = newSize;
            System.out.println("Replace EarPad with new size: " + newSize + ".");
        }
    }

    // 
    public static class NoiseCancellation {
        private boolean isActive;

        public NoiseCancellation(boolean isActive) {
            this.isActive = isActive;
            System.out.println("Noise cancellation is " + (isActive ? "active" : "inactive"));
        }

        public void toggle() {
            isActive = !isActive;
            System.out.println("Noise cancellation now " + (isActive ? "active" : "inactive"));
        }
    }
}
