public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Сумма кредита: 1 000 000 руб., срок кредита: 12 месяцев, процентная ставка 9.99%");
        System.out.println("Ежемесячный платеж: " + service.calculate(1000000, 12, 9.99) + " руб.");
        System.out.println();
        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 руб., срок кредита: 24 месяцев, процентная ставка 9.99%");
        System.out.println("Ежемесячный платеж: " + service.calculate(1000000, 24, 9.99) + " руб.");
        System.out.println();
        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 руб., срок кредита: 36 месяцев, процентная ставка 9.99%");
        System.out.println("Ежемесячный платеж: " + service.calculate(1000000, 36, 9.99) + " руб.");
    }
}