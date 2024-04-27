public class Main {
    public static void main(String[] args) {
        
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "English", 281, 5.5, 8.25,15.99);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", 1813, "English", 432, 5.2, 8,12.99);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "English", 180, 12.7, 20.3,11.99);

        
        book1.bookPrice();
        book2.openBook();
        book3.closeBook();

        
        Book.Chapter chapter1 = new Book.Chapter(2, "start","This is a summary.");
        Book.Cover cover1 = new Book.Cover("Yellow", "Bold");
        
        chapter1.Title();
        cover1.font();

        Headphones headphones1 = new Headphones("Pink", "Sony", 2022, "WH-1000XM4", 348.99, true, 30, 254);
        Headphones headphones2 = new Headphones("White", "Bose", 2021, "QuietComfort 35 II", 299.99, true, 20, 240);
        Headphones headphones3 = new Headphones("Green", "Beats", 2020, "Studio3", 349.95, true, 22, 260);

        // 
        headphones1.turnOn();
        headphones2.pairDevice("iPhone 13pro");
        headphones3.turnOff();

        // 
        Headphones.EarPad earPad1 = new Headphones.EarPad("leather", "medium");
        earPad1.replaceEarPad("large");

        Headphones.NoiseCancellation nc1 = new Headphones.NoiseCancellation(true);
        nc1.toggle();
    

    
        
        Refrigerator fridge1 = new Refrigerator("White", "Samsung", 2000, "Large", "RF28", 1200.00, 70.0, 35.0);
        Refrigerator fridge2 = new Refrigerator("Black", "LG", 2019, "Small", "LG420", 1100.00, 65.0, 32.0);
        Refrigerator fridge3 = new Refrigerator("Pink", "Whirlpool", 2021, "Small", "WP200", 900.00, 60.0, 25.5);

        // 
        fridge1.open();
        fridge2.close();
        fridge3.recharge();

        // 
        Refrigerator.Shelf shelf1 = new Refrigerator.Shelf("Plastic", 15.0);
        Refrigerator.Thermostat thermostat1 = new Refrigerator.Thermostat(5);

        // 
        shelf1.loadItems();
        shelf1.clean();
        thermostat1.increaseTemperature();
        thermostat1.decreaseTemperature();

        Television tv1 = new Television("Black", "Sony", 2022, "55 inches", "Bravia X90", 1500.00, 48.5, 28.0);
        Television tv2 = new Television("White", "Samsung", 2021, "65 inches", "QLED Q80", 2100.00, 57.5, 33.0);
        Television tv3 = new Television("Gray", "LG", 2023, "75 inches", "OLED C1", 3200.00, 66.0, 37.5);

        // 
        tv1.turnOn();
        tv2.turnOff();
        tv3.changeChannel();

        // 
        Television.RemoteControl remote1 = new Television.RemoteControl("Bluetooth", true);
        remote1.powerButton();
        remote1.volumeUp();

        Television.Speaker speaker1 = new Television.Speaker(100, false);
        speaker1.adjustVolume(50);
        speaker1.mute();

        Computer computer1 = new Computer("Silver", "Apple", 2020, "MacBook Pro", 2399.99, "M1", 16, 512);
        Computer computer2 = new Computer("Black", "Dell", 2022, "XPS 15", 1899.99, "Intel i7", 32, 1000);
        Computer computer3 = new Computer("white", "Lenovo", 2021, "ThinkPad X1", 1499.99, "AMD Ryzen 7", 16, 512);

        // 
        computer1.powerOn();
        computer2.powerOff();
        computer3.restart();

        // 
        Computer.GraphicsCard graphicsCard1 = new Computer.GraphicsCard("NVIDIA", "111", 20);
        graphicsCard1.upgradeMemory(16);

        Computer.OperatingSystem os1 = new Computer.OperatingSystem("Windows", "20.0");
        os1.updateOS("Windows 11");

        Lamp lamp1 = new Lamp("White", "Philips", 2022, "111", 49.99, 10, true);
        Lamp lamp2 = new Lamp("Black", "Ikea", 2021, "222", 29.99, 7, true);
        Lamp lamp3 = new Lamp("Silver", "LIFX", 2020, "333", 59.99, 11, true);

        // 
        lamp1.turnOn();
        lamp2.turnOff();
        lamp3.toggle();

        // 
        Lamp.Lightbulb bulb1 = new Lamp.Lightbulb(10, "LED");
        bulb1.replaceBulb(12, "Halogen");

        Lamp.Dimmer dimmer1 = new Lamp.Dimmer(5);
        dimmer1.adjustBrightness(10);

        RiceCooker cooker1 = new RiceCooker("White", "Panasonic", 2022, "111", 85.99, 1.0, true);
        RiceCooker cooker2 = new RiceCooker("Silver", "Zojirushi", 2021, "222", 199.99, 1.5, true);
        RiceCooker cooker3 = new RiceCooker("Black", "Cuckoo", 2020, "333", 110.00, 0.8, true);

        // 
        cooker1.turnOn();
        cooker2.cookRice();
        cooker3.turnOff();

        // 
        RiceCooker.Timer timer1 = new RiceCooker.Timer(30);
        timer1.setTime(30);

        RiceCooker.Steamer steamer1 = new RiceCooker.Steamer(true);
        steamer1.steamFood();
        
        AirConditioner ac1 = new AirConditioner("White", "Daikin", 2022, "111", 599.99, 5000, true);
        AirConditioner ac2 = new AirConditioner("Grey", "Samsung", 2021, "222", 650.00, 4500, true);
        AirConditioner ac3 = new AirConditioner("Black", "LG", 2020, "333", 700.00, 5500, true);

        // 
        ac1.turnOn();
        ac2.setTemperature(24);
        ac3.turnOff();

        // 
        AirConditioner.Filter filter1 = new AirConditioner.Filter("HEPA", false);
        filter1.cleanFilter();

        AirConditioner.RemoteControl remote = new AirConditioner.RemoteControl("Inverter");
        remote.changeMode("Cooling");

        MobilePhone phone1 = new MobilePhone("Black", "Apple", 2022, "iPhone 13", 999.99, 6.1, 128);
        MobilePhone phone2 = new MobilePhone("Blue", "Samsung", 2021, "Galaxy S21", 899.99, 6.2, 256);
        MobilePhone phone3 = new MobilePhone("White", "Google", 2020, "Pixel 5", 799.99, 6.0, 128);

        // 
        phone1.powerOn();
        phone2.call("567-456-7670");
        phone3.powerOff();

        // 
        MobilePhone.Camera camera1 = new MobilePhone.Camera(10);
        camera1.takePhoto();

        MobilePhone.Battery battery1 = new MobilePhone.Battery(4000);
        battery1.chargeBattery();




    
    
}
}
