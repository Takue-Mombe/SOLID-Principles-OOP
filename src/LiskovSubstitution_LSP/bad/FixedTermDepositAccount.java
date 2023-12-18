package LiskovSubstitution_LSP.bad;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account{

    @Override
    protected void deposit(BigDecimal amount) {
        //Deposit into Account
    }

    @Override
    protected void withdraw(BigDecimal amount) {
       throw new UnsupportedOperationException("Withdrawals are not Supported by" +
               "FixedTermDepositAccount");
    }
}
