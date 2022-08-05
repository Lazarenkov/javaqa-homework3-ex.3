public class Main {

    public static void main(String[] args) {
        CreditPaymentService service=new CreditPaymentService();
        int value=1000000; // сумма кредита
        double rate=9.99;  // ставка % годовых
        int time=3;        // срок, лет
        int payment= service.calcPayment(value, rate, time);
        System.out.println(payment);
    }
}
