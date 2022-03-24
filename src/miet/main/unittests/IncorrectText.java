package miet.main.unittests;

import miet.main.CheckData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncorrectText {

    @Test
    void checkText() {
        String text = "";
        System.out.println("Вводим текст - " + text);
        System.out.println("Результат:");
        CheckData.checkText(text);
    }
}