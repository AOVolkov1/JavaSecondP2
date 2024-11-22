public class Main {
    public static void main(String[] args) {

        int initial_balance = 200;       // Начальный баланс
        int addition = 1500;       // Сумма пополнения

        if (addition > 1000) {
            int bonuses = addition / 100;
            int final_balance = initial_balance + addition + bonuses;
            System.out.println(final_balance + " Баланс");
            System.out.println(bonuses + " Бонусные рубли");
        } else {
            int final_balance = initial_balance + addition;
            System.out.println(final_balance + " Баланс");
        }

    }
}