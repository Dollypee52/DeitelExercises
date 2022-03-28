package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void depositTest(){
        //given
        Account dolapoAccount = new Account();
        //when
        dolapoAccount.deposit(500);
        //assert
        assertEquals(500,dolapoAccount.getBalance());
    }
    @Test
    public void multipleDepositTest(){
        //given
        Account dolapoAccount = new Account();
        //when
        dolapoAccount.deposit(500);
        dolapoAccount.deposit(2000);
        dolapoAccount.deposit(1000);
        assertEquals(3500, dolapoAccount.getBalance());
    }
    @Test
    public void negativeDepositTest() {
        //given
        Account waleDeposit = new Account();
        //when
        waleDeposit.deposit(-500);
        assertEquals(0,waleDeposit.getBalance());
    }
    @Test
    public void withdrawalTest(){
        Account funmi = new Account();
        funmi.deposit(2000);
        funmi.withdraw(500);
        assertEquals(1500, funmi.getBalance());
    }
    @Test
    public void multipleWithdrawalTest(){
        Account funmi = new Account();
        funmi.deposit(2000);
        funmi.deposit(2000);
        funmi.withdraw(500);
        funmi.withdraw(800);
        funmi.withdraw(1300);
        assertEquals(1400, funmi.getBalance());
    }
    @Test
    public void negativeWithdrawalTest(){
        Account funmi = new Account();
        funmi.withdraw(-500);
        assertEquals(0, funmi.getBalance());
    }
    @Test
    public void overWithdrawalTest(){
        Account funmi = new Account();
        funmi.deposit(2000);
        funmi.withdraw(3500);
        assertEquals(2000, funmi.getBalance());
    }

}
