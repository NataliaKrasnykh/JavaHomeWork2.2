public class Main {
    public static void main(String[] args) {
        int InitialBalance = 150;
        int payment = 1050;
        int bonus;
        int balance;

        if (payment > 1000) {
            bonus = payment / 100;
            balance = InitialBalance + payment + bonus;
            System.out.println("Начислено " + bonus + " рублей бонусов. Итоговый баланс " + balance + " руб.");
        } else {
            balance = InitialBalance + payment;
            System.out.println("Бонусы к начислению отсутствуют. Итоговый баланс " + balance + " руб.");
        }
    }
}
