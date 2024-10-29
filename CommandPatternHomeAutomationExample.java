// Client
public class CommandPatternHomeAutomationExample {
    public static void main(String[] args) {
        // Create receiver objects
        Light livingRoomLight = new Light();
        Thermostat homeThermostat = new Thermostat();
        SecuritySystem homeSecurity = new SecuritySystem();

        // Create command objects
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command setTemperature = new SetTemperatureCommand(homeThermostat, 22);
        Command armSecurity = new ArmSecurityCommand(homeSecurity);
        Command disarmSecurity = new DisarmSecurityCommand(homeSecurity);

        // Set up the remote control with 5 slots
        MultiRemoteControl remoteControl = new MultiRemoteControl(5);

        // Assign commands to remote control slots
        remoteControl.setCommand(0, lightOn);
        remoteControl.setCommand(1, lightOff);
        remoteControl.setCommand(2, setTemperature);
        remoteControl.setCommand(3, armSecurity);
        remoteControl.setCommand(4, disarmSecurity);

        // Test commands by pressing buttons on the remote control
        remoteControl.pressButton(0);  // Turns the light ON
        remoteControl.pressButton(1);  // Turns the light OFF
        remoteControl.pressButton(2);  // Sets thermostat to 22 degrees
        remoteControl.pressButton(3);  // Arms the security system
        remoteControl.pressButton(4);  // Disarms the security system
    }
}
