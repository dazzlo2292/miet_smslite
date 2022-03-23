package miet.main;

import java.util.Scanner;

public class SendMessages {

    public static void sendMessages() throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите текст сообщения:");
        String text = scan.nextLine();
        System.out.println("Введите номер телефона абонента:");
        String address = scan.nextLine();

        if (CheckData.checkText(text) && CheckData.checkAddress(address)) {
            Message newMessage = new Message(text,address);

            Thread.sleep(3000L);
            System.out.println("\nНа номер " + newMessage.getAddress() + " отправлено следующее сообщение:");
            System.out.println("\"" + newMessage.getText() + "\"");

            int rand = (int) (Math.random() * 10);
            if (rand < 6) {
                newMessage.setStatus("Доставлено");
            } else {
                newMessage.setStatus("Недоставлено");
            }

            Thread.sleep(3000L);
            System.out.println("\nСтатус: " + newMessage.getStatus());
        } else {
            sendMessages();
        }
    }
}
