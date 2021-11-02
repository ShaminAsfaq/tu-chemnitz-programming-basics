package de.chemnitztu.tuchemnitzprogrammingbasics.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LectureTwoTest {
    @Autowired
    LectureTwo lectureTwo;

    @Test
    @DisplayName("De2Bi")
    void testDecimalToBinary() {
        assertAll(
                () -> assertEquals("1", lectureTwo.decimalToBinary(1)),
                () -> assertEquals("10", lectureTwo.decimalToBinary(2)),
                () -> assertEquals("11", lectureTwo.decimalToBinary(3)),
                () -> assertEquals("100", lectureTwo.decimalToBinary(4)),
                () -> assertEquals("101", lectureTwo.decimalToBinary(5)),
                () -> assertEquals("11100", lectureTwo.decimalToBinary(28))
        );
    }

    @Test
    @DisplayName("De2He")
    void testDecimalToHexadecimal() {
        assertAll(
                () -> assertEquals("1C", lectureTwo.decimalToHexadecimal(28)),
                () -> assertEquals("200", lectureTwo.decimalToHexadecimal(512)),
                () -> assertEquals("245", lectureTwo.decimalToHexadecimal(581)),
                () -> assertEquals("18F", lectureTwo.decimalToHexadecimal(399)),
                () -> assertEquals("102", lectureTwo.decimalToHexadecimal(258)),
                () -> assertEquals("400", lectureTwo.decimalToHexadecimal(1024))
        );
    }
}
