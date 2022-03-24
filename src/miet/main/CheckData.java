package miet.main;

public class CheckData {
    public static boolean checkText (String text) {
        if (text.isEmpty() || text.length() > 100) {
            System.err.println("Текст не введён или его длина более 100 символов!\n");
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