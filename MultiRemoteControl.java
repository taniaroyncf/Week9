public class MultiRemoteControl {
    private Command[] commands;

    public MultiRemoteControl(int slotCount) {
        commands = new Command[slotCount];
    }

    public void setCommand(int slot, Command command) {
        if (slot >= 0 && slot < commands.length) {
            commands[slot] = command;
        } else {
            System.out.println("Invalid slot number");
        }
    }

    public void pressButton(int slot) {
        if (slot >= 0 && slot < commands.length && commands[slot] != null) {
            commands[slot].execute();
        } else {
            System.out.println("No command assigned to this slot");
        }
    }
}
