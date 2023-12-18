package LiskovSubstitution_LSP.bad;

import java.math.BigDecimal;

public class SavingsAccount extends Account{
    @Override
    protected void deposit(BigDecimal amount) {
        //Deposit into Account
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        //withdraw from Account
    }
}
