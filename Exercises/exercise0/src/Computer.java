public class Computer {
    // 
    private String color;
    private String brand;
    private int year;
    private String model;
    private double price;
    private String processor;
    private double ram;  
    private double storage;  

    // 
    public Computer(String color, String brand, int year, String model, double price, String processor, double ram, double storage) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.price = price;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        System.out.println("This is a  Computer: " + brand + " " + model);
    }

    // 
    public void powerOn() {
        System.out.println("Power on the " + model + " computer.");
    }

    public void powerOff() {
        System.out.println("turn off the " + model + " computer.");
    }

    public void restart() {
        System.out.println("Restart the " + model + " computer.");
    }

    // 
    public static class GraphicsCard {
        private String brand;
        private String model;
        private double memory; //

        public GraphicsCard(String brand, String model, double memory) {
            this.brand = brand;
            this.model = model;
            this.memory = memory;
            System.out.println("Graphics Card installed: " + brand + " " + model + ", Memory: " + memory + "GB");
        }

        public void upgradeMemory(double newMemory) {
            this.memory = newMemory;
            System.out.println("Upgrade graphics card memory to " + newMemory + "GB.");
        }
    }

    // 
    public static class OperatingSystem {
        private String name;
        private String version;

        public OperatingSystem(String name, String version) {
            this.name = name;
            this.version = version;
            System.out.println("Opera System: " + name + " Version: " + version);
        }

        public void updateOS(String newVersion) {
            this.version = newVersion;
            System.out.println("Update OS to " + newVersion);
        }
    }
}
