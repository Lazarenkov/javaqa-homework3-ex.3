public class CreditPaymentService {
    public int calcPayment(int value, double rate, int time) {
        int payment;
        double m = rate / 12 / 100;
        int n = time * 12;
        double k = (m * Math.pow(1 + m, n)) / (Math.pow(1 + m, n) - 1);
        double paymentdouble = k * value;
        payment = (int) paymentdouble;

        return payment;
    }
}
