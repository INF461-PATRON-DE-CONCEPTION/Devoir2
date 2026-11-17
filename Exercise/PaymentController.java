public class PaymentController {
    public static void main(String[] args) {
        FabriquePaymentmethode fabrique = new FabriquePaymentmethode();

        PaymentMethode p = fabrique.fabriquePaymentmethode(FabriquePaymentmethode.ORANGE_MONEY);
        System.out.println(p.paymentmethode());

        p = fabrique.fabriquePaymentmethode(FabriquePaymentmethode.MOBILE_MONEY);
        System.out.println(p.paymentmethode());

        try {
            fabrique.fabriquePaymentmethode("Bank");
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
