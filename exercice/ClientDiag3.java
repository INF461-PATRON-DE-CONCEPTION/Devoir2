package construction.abstractFactory;

public class ClientDiag3 {
    public static void main(String[] args) {
        AbstractFactory[] fabriques = { new FactoryEssence(), new FactoryElectrique() };
        for (AbstractFactory f : fabriques) {
            f.construireScooter().methodeScooter();
            f.construireAutomobile().methodeAutomobile();
        }
    }
}
