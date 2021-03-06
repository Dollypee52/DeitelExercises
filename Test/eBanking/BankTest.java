package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
        private Bank gtBank;
        @Test

        @BeforeEach
        public void setUp() {
            gtBank = new Bank("GtBank", 10);
        }

        @Test
        public void bankCanBeCreated() {
            Bank gtBank = new Bank("GtBank", 10);
            assertNotNull(gtBank);
            assertEquals("GtBank", gtBank.getName());
            assertEquals(10, gtBank.getMaximumNoOfCustomers());
        }

        @Test
        public void bankCanCreateAccount() {
            gtBank.createAccountFor("Saheed", "Osupa", "1234");
            gtBank.createAccountFor("Amaka", "Amazing", "1234");
            gtBank.createAccountFor("Lanre", "Lan", "1234");
            gtBank.createAccountFor("MyGuy", "Okoro", "1234");
            assertEquals(4, gtBank.getNumberOfCustomers());
        }

        @Test
        public void createAccountCheckForCustomerTest() {
            gtBank.createAccountFor("Saheed", "Osupa", "1234");
            gtBank.createAccountFor("Amaka", "Amazing", "1234");
            gtBank.createAccountFor("Lanre", "Lan", "1234");
            gtBank.createAccountFor("MyGuy", "Okoro", "1234");
            assertEquals(4, gtBank.getNumberOfCustomers());

            Account account = gtBank.findAccount(4);
            assertEquals("MyGuy Okoro", account.getFullName());
            assertEquals("4", account.getAccountNumber());
        }

        @Test
        public void bankCanDepositMoneyTest() {
            gtBank.createAccountFor("Saheed", "Osupa", "1234");
            gtBank.deposit(1200, "1");
            gtBank.deposit(1200, "1");

            Account account = gtBank.findAccount(1);
            assertEquals(2400, account.getBalance("1234"));
        }

        @Test
        public void bankCanWithdrawMoneyTest() {
            gtBank.createAccountFor("Saheed", "Osupa", "1234");
            gtBank.deposit(1200, "1");
            gtBank.withdraw(1000, "1", "1234");

            Account account = gtBank.findAccount(1);
            assertEquals(200, account.getBalance("1234"));
        }
        @Test
        public void bankCanTransferMoneyTest() {
            gtBank.createAccountFor("Saheed", "Osupa", "1221");
            gtBank.createAccountFor("Amaka", "Amazing", "1234");

            gtBank.deposit(12000, "1");

            Account account = gtBank.findAccount(1);
            assertEquals(12000, account.getBalance("1221"));

            gtBank.transfer(200,"1","2","1221");

            account = gtBank.findAccount(1);
            assertEquals(11800, account.getBalance("1221"));

            account = gtBank.findAccount(2);
            assertEquals(200, account.getBalance("1234"));
        }
    }


