package de.chemnitztu.tuchemnitzprogrammingbasics.utils;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class LectureOne {
    Boolean[] centralPrimeFlags;

    /**
     * This is the constructor
     */
    public LectureOne() {
        this.centralPrimeFlags = makePrime();
    }

    //  1
    //  Start
    /**
     * GCD Calculation following the Euclidean Method
     * @param a is a number
     * @param b is a number
     * @return long
     */
    public long findGCD(long a, long b) {
        long maxx = Math.max(a, b);
        long minn = Math.min(a, b);
        long modd;

        do {
            modd = maxx % minn;
            maxx = minn;
            minn = modd;
        } while (modd != 0);
        return maxx;
    }
    //  Finished

    //  2
    //  Start
    /**
     * Prime number generation following the Sieve of Eratosthenes
     * @param flag is a Boolean Array
     * @param limit is the inclusive range to make primes within
     */
    public void sieve(Boolean[] flag, int limit) {
        for (int current = 2; current <= limit; current++) {
            if (flag[current]) {
                for (int temp = 2 * current; temp <= limit; temp += current) {
                    flag[temp] = false;
                }
            }
        }
    }
    //  Finished

    //  3
    //  Start
    /**
     * Calling the SIEVE method from this, hence the name.
     * @return Boolean[]
     */
    public Boolean[] makePrime() {
        int size = 10000000;
        Boolean[] flag = new Boolean[size + 100];
        Arrays.fill(flag, Boolean.TRUE);
        sieve(flag, size);
        return flag;
    }
    //  Finished

    //  4
    //  Start
    /**
     *
     * @param number is a parameter which we are tesing if it is a Prime number or not.
     * @return Boolean
     */
    public Boolean isPrime(int number) {
        return centralPrimeFlags[number];
    }
    //  Finish

    //  5
    //  Start
    /**
     * Addition of Two absurdly large numbers
     * @param firstNumber is a String
     * @param secondNumber is a String
     */
    public String addTwoHugeNumbers(String firstNumber, String secondNumber) {
        int firstNumberLength = firstNumber.length();
        int secondNumberLength = secondNumber.length();

        int minn = Math.min(firstNumberLength, secondNumberLength);
        int maxx = Math.max(firstNumberLength, secondNumberLength);

        int lengthDifference = maxx - minn;

        if (maxx == firstNumberLength) {
            StringBuilder secondNumberBuilder = new StringBuilder(secondNumber);
            secondNumberBuilder = new StringBuilder(new StringBuffer(secondNumberBuilder).reverse().toString());
            for (int inc = 0; inc < lengthDifference; inc++) {
                secondNumberBuilder.append('0');
            }
            secondNumber = new StringBuffer(secondNumberBuilder).reverse().toString();
        } else {
            StringBuilder firstNumberBuilder = new StringBuilder(firstNumber);
            firstNumberBuilder = new StringBuilder(new StringBuffer(firstNumberBuilder).reverse().toString());
            for (int inc = 0; inc < lengthDifference; inc++) {
                firstNumberBuilder.append('0');
            }
            firstNumber = new StringBuffer(firstNumberBuilder).reverse().toString();
        }

        StringBuilder sum = new StringBuilder();
        int carry = 0;
        for (int dec = maxx - 1; dec >=0; dec--) {
            int up = Integer.parseInt(String.valueOf(firstNumber.charAt(dec)));
            int down = Integer.parseInt(String.valueOf(secondNumber.charAt(dec)));

            up += down + carry;
            sum.append(up % 10);
            carry = up/10;
        }

        if(carry > 0) {
            sum.append(carry);
        }
        sum = new StringBuilder(new StringBuffer(sum.toString()).reverse().toString());
        return sum.toString();
    }
    //  Finished
}
















