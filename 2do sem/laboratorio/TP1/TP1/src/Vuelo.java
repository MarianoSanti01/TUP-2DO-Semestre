package SistReserva;

public class Vuelo {

    private String inicio;
    private String destino;

    private String horaAbordaje;

    private Piloto piloto;

    public Vuelo() {
    }

    public Vuelo(String origen, String destino, String horaAbordaje, Piloto piloto) {
        this.inicio = origen;
        this.destino = destino;
        this.horaAbordaje = horaAbordaje;
        this.piloto = piloto;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraAbordaje() {
        return horaAbordaje;
    }

    public void setHoraAbordaje(String horaAbordaje) {
        this.horaAbordaje = horaAbordaje;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
