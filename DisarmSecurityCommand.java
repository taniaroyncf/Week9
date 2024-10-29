
public class DisarmSecurityCommand implements Command {
    private SecuritySystem securitySystem;

    public DisarmSecurityCommand(SecuritySystem securitySystem) {
        this.securitySystem = securitySystem;
    }

    @Override
    public void execute() {
        securitySystem.disarm();
    }
}
