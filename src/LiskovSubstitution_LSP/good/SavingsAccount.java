package LiskovSubstitution_LSP.good;

import java.math.BigDecimal;

public class SavingsAccount extends WithdrawableAccount {
    @Override
    protected void deposit(BigDecimal amount) {
        //Deposit into Account
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        //withdraw from Account
    }
}
