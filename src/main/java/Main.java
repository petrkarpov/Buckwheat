public class Main {
    public static void main(String[] args) {
        int month = 18;
        int bankKg = month * 6;
        int sumForEverything = 0;

        while (bankKg != 0) {
            sumForEverything = getForOne(bankKg) + sumForEverything;
            bankKg = bankKg - 6;
        }
        System.out.println("Сумма за хранение гречки: " + sumForEverything + ", которая нужна Василию.");
    }

    private static int getForOne(int bankKg) {
        int sumForOneKg = 100;
        int sumForMonth = bankKg * sumForOneKg;
        return sumForMonth;
    }
}