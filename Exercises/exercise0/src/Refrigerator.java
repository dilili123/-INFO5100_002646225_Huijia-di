public class Refrigerator {
    
    private String color;
    private String brand;
    private int year;
    private String size;
    private String model;
    private double price;
    private double height;
    private double width;

    
    public Refrigerator(String color, String brand, int year, String size, String model, double price, double height, double width) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.size = size;
        this.model = model;
        this.price = price;
        this.height = height;
        this.width = width;
        System.out.println("This is a Refrigerator: " + model + " (" + color + ")");
    }

    
    public void open() {
        System.out.println("Refrigerator " + model + " opened.");
    }

    public void close() {
        System.out.println("Refrigerator " + model + " closed.");
    }

    public void recharge() {
        System.out.println("Refrigerator " + model + " is recharging.");
    }

    
    public static class Shelf {
        private String material;
        private double capacity;

        public Shelf(String material, double capacity) {
            this.material = material;
            this.capacity = capacity;
            System.out.println("Created Shelf made of " + material + " with capacity " + capacity + "kg");
        }

        public void loadItems() {
            System.out.println("Loading items onto the shelf.");
        }

        public void clean() {
            System.out.println("Cleaning the shelf.");
        }
    }

    
    public static class Thermostat {
        private int temperature;

        public Thermostat(int temperature) {
            this.temperature = temperature;
            System.out.println("Thermostat set to " + temperature + " degrees Celsius.");
        }

        public void increaseTemperature() {
            System.out.println("Increasing the refrigerator's temperature.");
        }

        public void decreaseTemperature() {
            System.out.println("Decreasing the refrigerator's temperature.");
        }
    }
}
