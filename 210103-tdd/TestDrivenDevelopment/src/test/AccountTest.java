package test;

import main.Account;

public class AccountTest {


    public void testAccount() throws Exception {
        Account account = new Account();
        if (account == null){
            throw new Exception("계좌생성 실패");
        }

    }

    public static void main(String[] args) {

        AccountTest test = new AccountTest();
        try {
            test.testAccount();
        } catch (Exception e) {
            System.out.println("fail");
            e.printStackTrace();
        }
        System.out.println("success");

    }


}
