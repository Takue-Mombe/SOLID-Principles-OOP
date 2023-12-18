package LiskovSubstitution_LSP.good;

import java.math.BigDecimal;

public class CheckingAcount extends WithdrawableAccount {
    @Override
    protected void deposit(BigDecimal amount) {
        //deposit into account
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        //withdraws
    }
}
