package test;

import main.Account;
import org.junit.Test;

import static org.junit.Assert.fail;


public class AccountTest {

    @Test
    public void accountTest() throws Exception {
        Account account = new Account(10000);
    }

    @Test
    public void testGetBalance() throws Exception{
        Account account = new Account(10000);
        if (account.getBalance() != 10000){
            fail("Error occurred!");
        }

    }


}
