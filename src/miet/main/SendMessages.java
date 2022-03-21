package miet.main;

import java.util.Scanner;

public class SendMessages {
    public static void sendMessages() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст сообщения:");
        String newText = scan.nextLine();
        System.out.print("");
        System.out.println("Введите номер телефона абонента:");
        String newAddress = scan.next();

        Message newMessage = new Message(newText, newAddress);

        Thread.sleep(3000L);
        System.out.println("На номер " + newMessage.getAddress() + " отправлено следующее сообщение:");
        System.out.println("\"" + newMessage.getText() + "\"");

        int rand = (int) (Math.random() * 10);
        if (rand < 6) {
            newMessage.setStatus("Доставлено");
        } else {
            newMessage.setStatus("Недоставлено");
        }

        Thread.sleep(3000L);
        System.out.println("Статус: " + newMessage.getStatus());

    }
}
