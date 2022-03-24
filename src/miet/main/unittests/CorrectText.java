package miet.main.unittests;

import miet.main.CheckData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrectText {

    @Test
    void checkText() {
        String text = "Hello my friend!";
        System.out.println("Вводим текст - " + text);
        System.out.println("Результат:");
        CheckData.checkText(text);
    }
}