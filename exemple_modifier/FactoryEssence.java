package exemple_modifier;

public class FactoryEssence extends AbstractFactory {
    public Automobile construireAutomobile() {
        return new AutomobileEssence();
    }

    public Scooter construireScooter() {
        return new ScooterEssence();
    }
}
