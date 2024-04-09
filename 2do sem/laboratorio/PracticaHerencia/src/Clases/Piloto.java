package Clases;

public class Piloto extends Persona implements Volador{
 private int carnetPiloto;

    public int getCarnetPiloto() {
        return carnetPiloto;
    }

    public void setCarnetPiloto(int carnetPiloto) {
        this.carnetPiloto = carnetPiloto;
    }

    public Piloto(int carnetPiloto) {
        this.carnetPiloto = carnetPiloto;
    }

    public Piloto(int age, String name, double pennisLong, int carnetPiloto) {
        super(age, name, pennisLong);
        this.carnetPiloto = carnetPiloto;
    }
    @Override
    public void comer(){}
    public void vuelo(){
        System.out.println(this.getName() + " Esta volando");
    }
}
