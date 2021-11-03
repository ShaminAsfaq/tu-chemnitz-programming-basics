package de.chemnitztu.tuchemnitzprogrammingbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TuChemnitzProgrammingBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuChemnitzProgrammingBasicsApplication.class, args);
        makePrime();

        getDivisors(6);
    }

    /*
    * Part 1
    * */
    public static int countSheep(int legs){
        return legs/4;
    }

    public static int furColourRatio(int black, int white) {
        if (black > white) return 1;
        else if (white > black) return -1;
        return 1;
    }

    public static boolean canFeed(int sheep, double hay) {
        return (sheep*2.5) >= hay;
    }

    public static double calculateSales(int sheep, double value) {
        return sheep*value;
    }
    /*---*/


    /*
     * Part 2
     * */
    static int size = 10000000;
    static Boolean[] flag = new Boolean[size + 100];
    static List<Integer> primeList = new ArrayList<>();
    static List<Integer> primeFactors = new ArrayList<>();
    static int[] numberCounter = new int[size+1000];
    static List<Integer> primesWhileDividing = new ArrayList<>();


    //  Start
    /**
     * Prime number generation following the Sieve of Eratosthenes
     * @param flag is a Boolean Array
     * @param limit is the inclusive range to make primes within
     */
    public static void sieve(Boolean[] flag, int limit) {
        for (int current = 2; current <= limit; current++) {
            if (flag[current]) {
                for (int temp = 2 * current; temp <= limit; temp += current) {
                    flag[temp] = false;
                }
            }
        }

        for (int current = 2; current <= limit; current++) {
            if (flag[current]) {
                primeList.add(current);
            }
        }
    }
    //  Finished

    //  Start
    /**
     * Calling the SIEVE method from this, hence the name.
     * @return Boolean[]
     */
    public static Boolean[] makePrime() {

        Arrays.fill(flag, Boolean.TRUE);
        sieve(flag, size);
        return flag;
    }
    //  Finished

    //  Start

    /**
     * biSection Method (or, Binary Search)
     * @param numberProvided is a double
     * @return The Square Root of the number provided
     */
    public static double squareRoot(double numberProvided) {
        double eps = 0.000000000001;
        double low = 0;
        double mid = 0;
        double high = numberProvided / 2;

        while (high-low > eps) {
            mid = (high + low) / 2;
            if ((mid*mid) > numberProvided) {
                high = mid;
            } else {
                low = mid;
            }
        }

        //  Fixing the precision to 7 digits after the decimal
        long fixedPrecision = 10000000L;
        long newRoot = (long) (mid * fixedPrecision);
        mid = (double) newRoot / fixedPrecision;

        return mid;
    }
    //  Finished

    //  Start
    public static void getPrimeFactors(long number) {
        long sq= (long) squareRoot(number);
        int prlen= size;

        for(int i=0; i<prlen && primeList.get(i)<=sq; i++) {
            if(number%primeList.get(i)==0) {
                primeFactors.add(primeList.get(i));
                while(number%primeList.get(i)==0) {
                    number/=primeList.get(i);
                    ++numberCounter[primeList.get(i)];
                }
                sq= (long) squareRoot(number);
            }
        }

        if(number>1) {
            primeList.add((int) number);
            ++numberCounter[(int) number];
        }
    }

    //  Start
    public static long power(int n, int p) {
        if(p==0)
            return 1;

        long prod= n;
        for(int i=1; i<p; i++)
            prod*=n;
        return prod;
    }
    //  Finished

    //  Start
    public static int getDivisors(long n) {
        getPrimeFactors(n);
        primesWhileDividing.add(1);
        int trlen= primesWhileDividing.size();

        for(int i=0; i<primeList.size(); i++) {
            for(int j=0; j<trlen; j++) {
                for(int z=1; z<=numberCounter[primeList.get(i)]; z++) {
//                cout << tr[j] << " multiplied by " << power(cr[i],z) << endl;
                    primesWhileDividing.add((int) (primesWhileDividing.get(j) * power(primeList.get(j),z)));
                }
            }
            trlen= primesWhileDividing.size();
        }
        return trlen = primesWhileDividing.size();
    }
    //  Finished


}

