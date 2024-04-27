public class RiceCooker {
    // 
    private String color;
    private String brand;
    private int year;
    private String model;
    private double price;
    private double capacity; 
    private boolean isDigital; 
    private boolean isOn; 

    // 
    public RiceCooker(String color, String brand, int year, String model, double price, double capacity, boolean isDigital) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.price = price;
        this.capacity = capacity;
        this.isDigital = isDigital;
        this.isOn = false;
        System.out.println("This is a Rice Cooker: " + model + " (" + color + ")");
    }

    // 
    public void turnOn() {
        this.isOn = true;
        System.out.println("The " + model + " rice cooker is turned on.");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("The " + model + " rice cooker is turned off.");
    }

    public void cookRice() {
        if (this.isOn) {
            System.out.println("Cooking rice with the " + model + " rice cooker.");
        } else {
            System.out.println("Please turn on the rice cooker first.");
        }
    }

    //
    public static class Timer {
        private int time; 

        public Timer(int time) {
            this.time = time;
            System.out.println("Timer set for " + time + " minutes.");
        }

        public void setTime(int newTime) {
            this.time = newTime;
            System.out.println("Timer updated to " + newTime + " minutes.");
        }
    }

    // 
    public static class Steamer {
        private boolean isFunctional; 

        public Steamer(boolean isFunctional) {
            this.isFunctional = isFunctional;
            System.out.println("Steamer is " + (isFunctional ? "functional" : "not functional"));
        }

        public void steamFood() {
            if (isFunctional) {
                System.out.println("Steaming food.");
            } else {
                System.out.println("Steamer is not functional, cannot steam food.");
            }
        }
    }
}
