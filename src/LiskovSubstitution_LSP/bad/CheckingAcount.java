package LiskovSubstitution_LSP.bad;

import java.math.BigDecimal;

public class CheckingAcount extends Account{
    @Override
    protected void deposit(BigDecimal amount) {
        //deposit into account
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        //withdraws
    }
}
