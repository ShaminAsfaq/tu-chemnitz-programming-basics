package de.chemnitztu.tuchemnitzprogrammingbasics.utils.lectures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class LectureOneTest {
    @Autowired
    LectureOne lectureOne;

    @Test
    @DisplayName("GCD")
    public void testFindGCD() {
        assertAll(
                () -> assertEquals(5, lectureOne.findGCD(10, 45)),
                () -> assertEquals(3, lectureOne.findGCD(1701, 3768)),
                () -> assertEquals(17, lectureOne.findGCD(17, 34))
        );
    }

    @Test
    @DisplayName("Prime Checker")
    public void testIsPrime() {
        assertAll(
                () -> assertEquals(true, lectureOne.isPrime(2)),
                () -> assertEquals(true, lectureOne.isPrime(3)),
                () -> assertEquals(false, lectureOne.isPrime(4)),
                () -> assertEquals(true, lectureOne.isPrime(5)),
                () -> assertEquals(false, lectureOne.isPrime(6)),
                () -> assertEquals(true, lectureOne.isPrime(7)),
                () -> assertEquals(false, lectureOne.isPrime(8)),
                () -> assertEquals(false, lectureOne.isPrime(9)),
                () -> assertEquals(false, lectureOne.isPrime(10)),
                () -> assertEquals(true, lectureOne.isPrime(11)),
                () -> assertEquals(true, lectureOne.isPrime(991))
        );
    }

    @Test
    @DisplayName("ADD")
    public void testAddTwoHugeNumbers() {
        assertAll(
                () -> assertEquals("15", lectureOne.addTwoHugeNumbers("5", "10")),
                () -> assertEquals("374", lectureOne.addTwoHugeNumbers("53", "321")),
                () -> assertEquals("138", lectureOne.addTwoHugeNumbers("69", "69")),
                () -> assertEquals("1000", lectureOne.addTwoHugeNumbers("999", "1")),
                () -> assertEquals("1998", lectureOne.addTwoHugeNumbers("999", "999")),
                () -> assertEquals("2", lectureOne.addTwoHugeNumbers("1", "1")),
                () -> assertEquals("88877445123412", lectureOne.addTwoHugeNumbers("854", "88877445122558")),
                () -> assertEquals("1111111110", lectureOne.addTwoHugeNumbers("123456789", "987654321")),
                () -> assertEquals("0", lectureOne.addTwoHugeNumbers("0", "0"))
        );
    }
}

