package miet.main.unittests;

import miet.main.CheckData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrectAddress {

    @Test
    void checkAddress() {
        String address = "9998887766";
        System.out.println("Вводим номер телефона - " + address);
        System.out.println("Результат:");
        CheckData.checkAddress(address);
    }
}