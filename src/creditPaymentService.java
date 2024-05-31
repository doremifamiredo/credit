public class creditPaymentService {
    public int month(int money, double percent, short period) {
        percent = percent / 12 / 100;
        double a = Math.pow(1 + percent, period);
        double b = Math.pow(1 + percent, period);
        double k = percent * a / (b - 1);
        double x = money * k;
        return (int) x;
    }
}
