package de.chemnitztu.tuchemnitzprogrammingbasics.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BasicServiceTest {
    @Autowired BasicService basicService;

    @Test
    public void findGCD() {
        basicService.findGCD(10, 45);
        basicService.findGCD(1701, 3768);
    }

    @Test
    public void makePrime() {
        basicService.isPrime(2);
        basicService.isPrime(3);
        basicService.isPrime(4);
        basicService.isPrime(5);
        basicService.isPrime(6);
        basicService.isPrime(7);
    }
}
