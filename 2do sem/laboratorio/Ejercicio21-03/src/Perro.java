public class Perro extends Canino{
    public Perro(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }
    public void comer(){
        super.comer();
    }
    public void hacerRuido(){
        super.hacerRuido();
    }

    public void vacunar(){
        System.out.println("*pinchan al perro*");
    }
    public void sacarPaseo(){
        System.out.println("*El perro desea salir a pasear");
    }
}
