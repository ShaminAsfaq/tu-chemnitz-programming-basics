package de.chemnitztu.tuchemnitzprogrammingbasics.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BasicServiceTest {
    @Autowired
    BasicService basicService;

    @Test
    @DisplayName("GCD")
    public void testFindGCD() {
        assertAll(
                () -> assertEquals(5, basicService.findGCD(10, 45)),
                () -> assertEquals(3, basicService.findGCD(1701, 3768)),
                () -> assertEquals(17, basicService.findGCD(17, 34))
        );
    }

    @Test
    @DisplayName("Prime Checker")
    public void testIsPrime() {
        assertAll(
                () -> assertEquals(true, basicService.isPrime(2)),
                () -> assertEquals(true, basicService.isPrime(3)),
                () -> assertEquals(false, basicService.isPrime(4)),
                () -> assertEquals(true, basicService.isPrime(5)),
                () -> assertEquals(false, basicService.isPrime(6)),
                () -> assertEquals(true, basicService.isPrime(7)),
                () -> assertEquals(false, basicService.isPrime(8)),
                () -> assertEquals(false, basicService.isPrime(9)),
                () -> assertEquals(false, basicService.isPrime(10)),
                () -> assertEquals(true, basicService.isPrime(11)),
                () -> assertEquals(true, basicService.isPrime(991))
        );
    }

    @Test
    @DisplayName("ADD")
    public void testAddTwoHugeNumbers() {
        assertAll(
                () -> assertEquals("15", basicService.addTwoHugeNumbers("5", "10")),
                () -> assertEquals("374", basicService.addTwoHugeNumbers("53", "321")),
                () -> assertEquals("138", basicService.addTwoHugeNumbers("69", "69")),
                () -> assertEquals("1000", basicService.addTwoHugeNumbers("999", "1")),
                () -> assertEquals("1998", basicService.addTwoHugeNumbers("999", "999")),
                () -> assertEquals("2", basicService.addTwoHugeNumbers("1", "1")),
                () -> assertEquals("88877445123412", basicService.addTwoHugeNumbers("854", "88877445122558")),
                () -> assertEquals("1111111110", basicService.addTwoHugeNumbers("123456789", "987654321")),
                () -> assertEquals("0", basicService.addTwoHugeNumbers("0", "0"))
        );
    }
}

