package de.chemnitztu.tuchemnitzprogrammingbasics.utils;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BasicService {
    public void findGCD(long a, long b) {
        long maxx = Math.max(a, b);
        long minn = Math.min(a, b);
        long modd;

        do {
            modd = maxx % minn;
            maxx = minn;
            minn = modd;
        } while (modd != 0);
        System.out.println("GCD(" + a + "," + b + ") = " + maxx);
    }

    public void sieve(Boolean[] flag, int limit) {
        for (int current = 2; current <= limit; current++) {
            if (flag[current]) {
                for (int temp = 2 * current; temp <= limit; temp += current) {
                    flag[temp] = false;
                }
            }
        }
    }

    public Boolean[] makePrime() {
        int size = 1000;
        Boolean[] flag = new Boolean[size+100];
        Arrays.fill(flag, Boolean.TRUE);

        sieve(flag, size);

        return flag;
    }

    public Boolean isPrime(int number) {
        Boolean[] primeFlags = makePrime();
        return primeFlags[number];
    }
}
