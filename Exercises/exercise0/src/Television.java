public class Television {
    //
    private String color;
    private String brand;
    private int year;
    private String size;  
    private String model;
    private double price;
    private double width;
    private double height;

    //
    public Television(String color, String brand, int year, String size, String model, double price, double width, double height) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.size = size;
        this.model = model;
        this.price = price;
        this.width = width;
        this.height = height;
        System.out.println("This is a Television: " + brand + " " + model + ", " + size);
    }

    //
    public void turnOn() {
        System.out.println("Turning on the " + model + " television.");
    }

    public void turnOff() {
        System.out.println("Turning off the " + model + " television.");
    }

    public void changeChannel() {
        System.out.println("Changing channel on the " + model + " television.");
    }

    // 
    public static class RemoteControl {
        private String type;
        private boolean isUniversal;

        public RemoteControl(String type, boolean isUniversal) {
            this.type = type;
            this.isUniversal = isUniversal;
            System.out.println("Remote control type: " + type + ", Universal: " + isUniversal);
        }

        public void powerButton() {
            System.out.println("Pressing the power button on the remote control.");
        }

        public void volumeUp() {
            System.out.println("Increasing volume using the remote control.");
        }

        public void volumeDown() {
            System.out.println("Decreasing volume using the remote control.");
        }
    }

    // 
    public static class Speaker {
        private int maxVolume;
        private boolean isBuiltIn;

        public Speaker(int maxVolume, boolean isBuiltIn) {
            this.maxVolume = maxVolume;
            this.isBuiltIn = isBuiltIn;
            System.out.println("Speaker created, Max Volume: " + maxVolume + ", Built-in: " + isBuiltIn);
        }

        public void adjustVolume(int volume) {
            System.out.println("Adjusting the speaker volume to " + volume);
        }

        public void mute() {
            System.out.println("Muting the television speakers.");
        }
    }
}
