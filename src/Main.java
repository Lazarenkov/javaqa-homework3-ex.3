public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Сумма кредита = 1 000 000 руб.");
        System.out.println("Ставка = 9,99%");
        System.out.println("Срок = 1 год");
        System.out.println("Размер ежемесячного платежа = " + service.calcPayment(1000000, 9.99, 1) + " руб.");
        System.out.println();

        System.out.println("Сумма кредита = 1 000 000 руб.");
        System.out.println("Ставка = 9,99%");
        System.out.println("Срок = 2 года");
        System.out.println("Размер ежемесячного платежа = " + service.calcPayment(1000000, 9.99, 2) + " руб.");
        System.out.println();

        System.out.println("Сумма кредита = 1 000 000 руб.");
        System.out.println("Ставка = 9,99%");
        System.out.println("Срок = 3 года");
        System.out.println("Размер ежемесячного платежа = " + service.calcPayment(1000000, 9.99, 3) + " руб.");
    }
}
