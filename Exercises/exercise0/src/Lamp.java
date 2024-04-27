public class Lamp {
    // 
    private String color;
    private String brand;
    private int year;
    private String model;
    private double price;
    private double wattage; 
    private boolean isLed;
    private boolean isOn;

    // 
    public Lamp(String color, String brand, int year, String model, double price, double wattage, boolean isLed) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.price = price;
        this.wattage = wattage;
        this.isLed = isLed;
        this.isOn = false; // 
        System.out.println("This a  Lamp: " + model + " (" + color + ")");
    }

    // 
    public void turnOn() {
        this.isOn = true;
        System.out.println("The " + model + " lamp is turn on.");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("The " + model + " lamp is turn off.");
    }

    public void toggle() {
        this.isOn = !this.isOn;
        System.out.println("The " + model + " lamp is now " + (this.isOn ? "on" : "off") + ".");
    }

    //
    public static class Lightbulb {
        private int wattage;
        private String type; // 

        public Lightbulb(int wattage, String type) {
            this.wattage = wattage;
            this.type = type;
            System.out.println("Installed a " + type + " lightbulb of " + wattage + " watts.");
        }

        public void replaceBulb(int newWattage, String newType) {
            this.wattage = newWattage;
            this.type = newType;
            System.out.println("Replaced with a " + newType + " lightbulb of " + newWattage + " watts.");
        }
    }

    //
    public static class Dimmer {
        private int brightnessLevel; // 

        public Dimmer(int brightnessLevel) {
            this.brightnessLevel = brightnessLevel;
            System.out.println("Dimmer set to level " + brightnessLevel);
        }

        public void adjustBrightness(int newLevel) {
            this.brightnessLevel = newLevel;
            System.out.println("Brightness adjusted to level " + newLevel);
        }
    }
}
