
public class Main {
    public static void main(String[] args) {

        Executive executive = new Executive ("Carlos","Ruiz", 50000);

        Operator operator = new Operator ("Ivan","Romanov", 50000);

        Official official = new Official ("Gato","Romanov",5000);

        Technical technical = new Technical ("Perro","Romanov",5000);

        executive.mostrarDatos2();
        operator.mostrarDatos2();
        official.mostrarDatos2();
        technical.mostrarDatos2();

    }
}