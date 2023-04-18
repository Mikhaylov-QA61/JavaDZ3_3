public class CreditPaymentService {
    public double calculate(int sum, int months, double interestRate) {
        double rateMonths = (interestRate / 12) / 100;
        double x = 1 + rateMonths;
        double c = Math.pow(x, months);
        double payment = sum * ((rateMonths * c) / (c - 1));
        return (int) payment;
    }
}
