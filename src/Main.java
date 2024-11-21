public class Main {
    public static void main(String[] args) {

        int a = 200;       // Начальный баланс
        int b = 1500;       // Сумма пополнения

        if (b > 1000) {
            int c = b / 100;
            int x = a + b + c;
            System.out.println(x + " Баланс");
            System.out.println(c + " Бонусные рубли");
        } else {
            int x = a + b;
            System.out.println(x + " Баланс");
        }

    }
}