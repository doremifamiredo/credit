public class Main {
    public static void main(String[] args) {
        creditPaymentService calculate = new creditPaymentService();
        int money = 1_000_000;
        byte years = 1;
        short period = (short) (years * 12);
        double percent = 9.99;
        int payment = calculate.month(money, percent, period);
        System.out.println("При сумме предита " + money + " рублей");
        System.out.println("ставке " + percent + "% годовых");
        System.out.println("сроком на " + years + " год(а)/лет");
        System.out.println("ежемесячный платёж составит " + payment + " рублей.");
        System.out.println();
        years = 2;
        period = (short) (years * 12);
        payment = calculate.month(money, percent, period);
        System.out.println("На " + years + " год(а)/лет");
        System.out.println("ежемесячный платёж составит " + payment + " рублей.");
        System.out.println();
        years = 3;
        period = (short) (years * 12);
        payment = calculate.month(money, percent, period);
        System.out.println("На " + years + " год(а)/лет");
        System.out.println("ежемесячный платёж составит " + payment + " рублей.");
        System.out.println();
    }
}