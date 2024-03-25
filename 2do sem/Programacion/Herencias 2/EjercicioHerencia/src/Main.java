public class Main {
    public static void main(String[] args) {
        SavingsAccount SA = new SavingsAccount(15000, 5);

        SA.consign(5000); // Consignar $5000
        SA.withdraw(2000); // Retirar $2000
        SA.monthlyStatement(); // Generar el estado de cuenta mensual

        System.out.println("Información de la cuenta de ahorros:");
        SA.printInfo();
    }
}