package LiskovSubstitution_LSP.good;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account {

    @Override
    protected void deposit(BigDecimal amount) {
        //Deposit into Account
    }
}
