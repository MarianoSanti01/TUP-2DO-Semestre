public class SavingsAccount extends Account {
    private boolean isActive;

    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate);
        isActive = balance >= 10000;
    }

    @Override
    public void consign(float amount) {
        if (isActive) {
            super.consign(amount);
        } else {
            System.out.println("No se puede consignar dinero en una cuenta inactiva.");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (isActive) {
            super.withdraw(amount);
        } else {
            System.out.println("No se puede retirar dinero de una cuenta inactiva.");
        }
    }

    @Override
    public void monthlyStatement() {
        if (numberWithdrawals > 4) {
            monthlyCommission += (numberWithdrawals - 4) * 1000;
        }
        isActive = balance >= 10000;
        super.monthlyStatement();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Estado de la cuenta: " + (isActive ? "Activa" : "Inactiva"));
    }
}
