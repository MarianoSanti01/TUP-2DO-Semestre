public abstract class Account {

    protected float balance;
    protected int numberConsignments = 0;
    protected int numberWithdrawals = 0;
    protected float annualRate;
    protected float monthlyCommission = 0;

    public Account(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }

    public void consign(float amount){
        balance += amount;
        numberConsignments++;
    }

    public void withdraw(float amount){
        float newBalance = balance - amount;
        if(newBalance >= 0){
            balance -= amount;
            numberWithdrawals++;
        }else{
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }
    }

    public void calculateInterest(){
        float monthlyRate = annualRate / 12;
        float monthlyInterest = balance * monthlyRate;
        balance += monthlyInterest;
    }

    public void monthlyStatement(){
        balance -= monthlyCommission;
        calculateInterest();
    }
    public void printInfo(){
        System.out.println("Balance: " + balance);
        System.out.println("Numero de consignaciones: " + numberConsignments);
        System.out.println("Numero de retiros: " + numberWithdrawals);
        System.out.println("Tasa Anual: " + annualRate);
        System.out.println("Comision mensual: " + monthlyCommission);
    }
}
