package miet.main;

import java.util.Scanner;

public class Menu {
    public static void printMenu() {
        System.out.println("Выберите способ отправки:");
        System.out.println("1 - Отправка индивидуального сообщения");
        System.out.println("2 - Отправка рассылки");
        System.out.println("0 - Выход");
    }

    public static void setMenu() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number == 1) {
            SendMessages.sendMessages();
        } else if (number == 2) {
            System.out.println("Code empty");
        } else if (number != 0) {
            System.out.println("Указан неверный пункт меню!");
            setMenu();
        }
    }
}
