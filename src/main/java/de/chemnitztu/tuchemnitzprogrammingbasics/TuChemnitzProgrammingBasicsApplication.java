package de.chemnitztu.tuchemnitzprogrammingbasics;

import de.chemnitztu.tuchemnitzprogrammingbasics.models.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TuChemnitzProgrammingBasicsApplication {
    public static void main(String[] args) {
        SpringApplication.run(TuChemnitzProgrammingBasicsApplication.class, args);

        Account petersAccount = new Account(1010101, 4567);
        System.out.println(petersAccount.getAccountNumber()); // returns 1010101
        System.out.println(petersAccount.getPin()); // returns 22
        petersAccount.credit(5000.0);
        System.out.println(petersAccount.getBalance()); // returns 5000.0
        System.out.println(petersAccount.debit(150.0, 4567)); // returns true
        System.out.println(petersAccount.debit(150.0, 4577)); // returns false (wrong pin)
        System.out.println(petersAccount.debit(5500.0, 4567)); // returns false (not enough money on the account)
        System.out.println(petersAccount.getBalance()); // returns 4850.0 (150 were debited once)

        Account sallysAccount = new Account(1010102, 9984);
        System.out.println(petersAccount.transferTo(sallysAccount, 563.5, 4567)); //returns true
        System.out.println(petersAccount.getBalance()); //returns 4286.5
        System.out.println(sallysAccount.getBalance()); //returns 563.5
    }


}

