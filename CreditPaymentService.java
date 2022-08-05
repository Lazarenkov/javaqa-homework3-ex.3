public class CreditPaymentService {

    public double calcPayment(double value, double rate, double time){
        double payment;
        double m = rate/12/100;
        double n = time*12;
        double k=(m*Math.pow(1+m,n))/(Math.pow(1+m,n)-1);
        payment=k*value;

        return payment;
    }
}
