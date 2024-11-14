public class Robot {
    int batteryLevel = 100; // Battery level percentage (0 to 100)
    int speed = 0; // Current speed of the robot
    String name = "Robo";//Name of the robot
    String color = "red";

    //creating a move method
    public void move() {
        speed = 5;
        System.out.println(name + " is moving at speed " + speed + " mph");
    }

    //creating a stop method
    public void stop() {
        speed = 0;
        System.out.println(name + " has stopped.");
    }

    //creating a charge battery method
    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println(name + "'s battery is fully charged.");
    }

    //creating a check battery level method
    public void checkBatteryLevel() {
        System.out.println(name + "'s current battery level is: " + batteryLevel + "%");
    }

    //creating a new method for color
    public void displayInfo() {
        System.out.println("The color of " + name + " is " + color);
    }
}

