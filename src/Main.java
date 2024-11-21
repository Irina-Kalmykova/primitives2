public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 3000;

        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }
        int finalBalance = balance + replenishment + bonus;
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}