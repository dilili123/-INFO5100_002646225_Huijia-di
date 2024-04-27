public class AirConditioner {
    // 
    private String color;
    private String brand;
    private int year;
    private String model;
    private double price;
    private double btu; 
    private boolean isSmart; 
    private boolean isOn;

    //
    public AirConditioner(String color, String brand, int year, String model, double price, double btu, boolean isSmart) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.price = price;
        this.btu = btu;
        this.isSmart = isSmart;
        this.isOn = false; 
        System.out.println("This is a Air Conditioner: " + model + " (" + brand + ")");
    }

    // 
    public void turnOn() {
        this.isOn = true;
        System.out.println("The " + model + " air conditioner is turned on.");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("The " + model + " air conditioner is turned off.");
    }

    public void setTemperature(int temperature) {
        if (this.isOn) {
            System.out.println("Setting temperature to " + temperature + "°C on " + model + ".");
        } else {
            System.out.println("Please turn on the air conditioner first.");
        }
    }

    // 
    public static class Filter {
        private String type;
        private boolean isClean;

        public Filter(String type, boolean isClean) {
            this.type = type;
            this.isClean = isClean;
            System.out.println("Air conditioner filter type: " + type + ", is clean: " + isClean);
        }

        public void cleanFilter() {
            this.isClean = true;
            System.out.println("Cleaning the air conditioner filter.");
        }
    }

    // 
    public static class RemoteControl {
        private String model;

        public RemoteControl(String model) {
            this.model = model;
            System.out.println("Remote control for model: " + model);
        }

        public void changeMode(String mode) {
            System.out.println("Changing mode to " + mode + " using remote control.");
        }
    }
}
