// Concrete Commands for Security System
public class ArmSecurityCommand implements Command {
    private SecuritySystem securitySystem;

    public ArmSecurityCommand(SecuritySystem securitySystem) {
        this.securitySystem = securitySystem;
    }

    @Override
    public void execute() {
        securitySystem.arm();
    }
}