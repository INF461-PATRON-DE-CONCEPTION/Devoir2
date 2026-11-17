package construction.abstractFactory;

public class FactoryHydrolic extends AbstractFactory {
    public Automobile construireAutomobile() {
        return new AutomobileHydrolic();
    }

    public Scooter construireScooter() {
        return new ScooterHydrolic();
    }
}
