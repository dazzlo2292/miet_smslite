package miet.main;

public class CheckData {
    public static boolean checkText (String text) {
        if (text.isEmpty() || text.length() > 2000) {
            System.err.println("Введён некорректный текст!\n");
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkAddress (String address) {
        if (address.length() != 10 || address.charAt(0) == '0') {
            System.err.println("Введён некорретный номер!");
            System.out.println("----------\n");
            return false;
        } else {
            return true;
        }
    }
}