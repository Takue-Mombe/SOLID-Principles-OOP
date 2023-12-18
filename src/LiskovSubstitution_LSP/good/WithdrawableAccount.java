package LiskovSubstitution_LSP.good;

import java.math.BigDecimal;

public abstract class WithdrawableAccount extends Account{
    @Override
    protected void deposit(BigDecimal amount) {
        //deposits
    }

    protected abstract void withdraw(BigDecimal amount);
}
