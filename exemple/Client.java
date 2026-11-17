package exemple;

public class Client {
    public static void main(String[] args) {
        Scooter scooter = null;
        Automobile automobile = null;

        System.out.println("FactoryEssence");
        AbstractFactory fEssence = new FactoryEssence();
        scooter = fEssence.construireScooter();
        automobile = fEssence.construireAutomobile();
        scooter.methodeScooter();
        automobile.methodeAutomobile();

        System.out.println("FactoryElectrique");
        AbstractFactory fElectrique = new FactoryElectrique();
        scooter = fElectrique.construireScooter();
        automobile = fElectrique.construireAutomobile();
        scooter.methodeScooter();
        automobile.methodeAutomobile();
    }
}
