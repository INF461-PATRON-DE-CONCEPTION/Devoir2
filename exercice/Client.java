package construction.abstractFactory;

public class Client {

    static void utiliser(String famille, AbstractFactory fabrique) {
        System.out.println("--- Famille " + famille + " ---");
        Scooter scooter = fabrique.construireScooter();
        Automobile automobile = fabrique.construireAutomobile();
        scooter.methodeScooter();
        automobile.methodeAutomobile();
    }

    public static void main(String[] args) {
        utiliser("Essence",    new FactoryEssence());
        utiliser("Electrique", new FactoryElectrique());
        utiliser("Hydrolic",   new FactoryHydrolic());
    }
}
