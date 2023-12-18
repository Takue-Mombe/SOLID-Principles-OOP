package LiskovSubstitution_LSP.good;

import java.math.BigDecimal;

public class BankingAppWithdrawalService extends WithdrawableAccount{
    private Account account;
    private WithdrawableAccount withdrawableAccount;
    public BankingAppWithdrawalService(WithdrawableAccount withdrawableAccount){
        this.withdrawableAccount=withdrawableAccount;
    }

    public void withdraw(BigDecimal amount){
        withdrawableAccount.withdraw(amount);
    }
}
