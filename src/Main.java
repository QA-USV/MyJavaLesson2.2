public class Main {
    public static void main(String[] args) {

        int currentSum = 120;
        int sumToAdd = 1590;
        int sumToAddToGetBonus = 1000;
        int bonusForEachSum = 100;
        int bonus = 1;
        boolean rightToGetBonus = sumToAdd > sumToAddToGetBonus;
        int bonusTotal = rightToGetBonus ? sumToAdd / bonusForEachSum * bonus : 0;
        int balance = currentSum + sumToAdd + bonusTotal;
        System.out.println("Спасибо за пополнение счета на " + sumToAdd + " рублей!");
        System.out.println("Вам начислено " + bonusTotal + " бонусных рублей.");
        System.out.println("Баланс Вашего счета " + balance + " рублей.");
    }
}