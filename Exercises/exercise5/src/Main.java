
public class Main {
    public static void main(String[] args) {
        // Demonstration of Singleton Pattern
        Database database = Database.getInstance();
        database.query("SELECT * FROM users");

        // Demonstration of Factory Pattern
        Vehicle car = VehicleFactory.getVehicle("car");
        car.start();
        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.start();

        // Demonstration of Observer Pattern
        NotificationService service = new NotificationService();
        User user1 = new User("John");
        User user2 = new User("Jane");

        service.addObserver(user1);
        service.addObserver(user2);

        service.notifyObservers("Welcome to our notification service!");

        // After some events, remove an observer
        service.removeObserver(user2);
        service.notifyObservers("Goodbye from our notification service!");
    }
}
