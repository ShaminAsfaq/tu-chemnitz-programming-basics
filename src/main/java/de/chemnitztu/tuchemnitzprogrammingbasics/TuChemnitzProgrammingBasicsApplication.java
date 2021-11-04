package de.chemnitztu.tuchemnitzprogrammingbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TuChemnitzProgrammingBasicsApplication {

    //WRITE YOUR ANSWER HERE
    /**
     * Task 1
     * @param sheep is an integer
     * @return
     */
    public static int herdDivisors(int sheep) {
        int count = 0;
        for (int idx = 1; idx <= sheep; idx++) {
            if (sheep%idx == 0) ++count;
        }
        return count;
    }


    public static void main(String[] args) {
        SpringApplication.run(TuChemnitzProgrammingBasicsApplication.class, args);

        java.util.Scanner scan = new java.util.Scanner(System.in);
        int sheep = scan.nextInt();

        System.out.println(herdDivisors(sheep));
    }


}

