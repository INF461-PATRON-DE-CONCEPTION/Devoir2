public class FabriquePaymentmethode {
    public static final String ORANGE_MONEY = "ORANGE";
    public static final String MOBILE_MONEY = "MOBILE";

    public PaymentMethode fabriquePaymentmethode(String type) {
        switch (type) {
            case ORANGE_MONEY:
                return new OrangeMoney();
            case MOBILE_MONEY:
                return new MobileMoney();
            default:
                throw new IllegalArgumentException("Methode de paiement inconnue : " + type);
        }
    }
}
