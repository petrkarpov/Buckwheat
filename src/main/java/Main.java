public class Main {
    public static void main(String[] args) {
        int month = 18;
        int bankKg = month * 6;
        int sumZaVse = 0;

        while (bankKg != 0) {
            sumZaVse = getForOne(bankKg) + sumZaVse;
            bankKg = bankKg - 6;
        }

        System.out.println(sumZaVse);

    }

    private static int getForOne(int bankKg) {
        int sumZaKg = 100;
        int sumZaMonth = bankKg * sumZaKg;
        return sumZaMonth;
    }
}