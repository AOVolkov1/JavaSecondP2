public class Main {
    public static void main(String[] args) {

        int initialBalance = 200;       // Начальный баланс
        int addition = 1500;       // Сумма пополнения

        if (addition > 1000) {
            int bonuses = addition / 100;
            int finalBalance = initialBalance + addition + bonuses;
            System.out.println(finalBalance + " Баланс");
            System.out.println(bonuses + " Бонусные рубли");
        } else {
            int finalBalance = initialBalance + addition;
            System.out.println(finalBalance + " Баланс");
        }

    }
}