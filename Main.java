public class Main {

    public static void main(String[] args) {
        CreditPaymentService service=new CreditPaymentService();
        double value=1000000;
        double rate=9.99;
        double time=1;
        double payment= service.calcPayment(value, rate, time);
        System.out.println(payment);
    }
}
