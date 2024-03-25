public class CheckingAccount extends Account {
    private float overdraft;

    public CheckingAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }

    @Override
    public void withdraw(float amount) {
        if (balance >= amount) {
            super.withdraw(amount);
        } else {
            overdraft += (amount - balance);
            balance = 0;
            numberWithdrawals++;
        }
    }

    @Override
    public void consign(float amount) {
        if (overdraft > 0) {
            if (amount >= overdraft) {
                balance += (amount - overdraft);
                overdraft = 0;
            } else {
                overdraft -= amount;
            }
        } else {
            super.consign(amount);
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sobregiro: " + overdraft);
    }
}