package th.ac.ku.swt012020;

import java.util.Arrays;

public class Agent {
    private float depositPerTime = 30000.00f;
    private float depositPerDay = 50000.00f;
    private String[] validAccountList = {"401367301", "495982636"};

    public boolean checkDepositPerTransaction(float depositCash) {
        return depositCash <= this.depositPerTime;
    }

    public boolean checkDepositPerDay(float depositCash) {
        return depositCash <= this.depositPerDay;
    }

    public  boolean checkSuspendedAccount(String accountNumber)
    {
        return Arrays.stream(this.validAccountList).anyMatch(accountNumber::equals);
    }

    public boolean checkMinimumDepositPerTime(float depositCash, String accountType){
        return depositCash >= getMinimumDepositPerTransactionLimit(accountType);
    }

    private float getMinimumDepositPerTransactionLimit(String accountType) {
        return 100.00f;
    }
}