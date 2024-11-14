//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robot myRobot = new Robot(); //create a new Robot object
        myRobot.move(); //make the robot move
        myRobot.checkBatteryLevel(); //check battery level
        myRobot.stop(); //stop the robot
        myRobot.chargeBattery(); //charge the robot's battery
        myRobot.displayInfo();
    }
}
