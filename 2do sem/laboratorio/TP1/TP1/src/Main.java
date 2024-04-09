import SistReserva.Pasajero;
import SistReserva.Piloto;
import SistReserva.Persona;
import SistReserva.SistReserva;
import SistReserva.Vuelo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Piloto pilot = new Piloto();
        pilot.setDni(5471789);
        pilot.setCarnetPiloto("29AA");
        pilot.setNombre("Hector");
        pilot.setApellido("Zapata");
        pilot.setEdad(69);

        Pasajero pasa = new Pasajero("Thomas","Munios",19,4468882,10.00,25);

        Vuelo vuel = new Vuelo("Ushuaia", "Hong Kong", "17:00", pilot);

        SistReserva reserva = new SistReserva(pasa,vuel);

        reserva.Reservar();

    }
}