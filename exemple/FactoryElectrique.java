package exemple;

public class FactoryElectrique extends AbstractFactory {
    public Automobile construireAutomobile() {
        return new AutomobileElectrique();
    }

    public Scooter construireScooter() {
        return new ScooterElectrique();
    }
}
