package de.egga.banking;

import org.junit.Test;

public class AccountTest {

    @Test
    public void itName() {
        Account account = new Account();
        Printer printer = new Printer();
        account.printStatement();
    }
}
