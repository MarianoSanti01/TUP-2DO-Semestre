public class Gato extends Felino{
    public Gato(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }
    public void comer(){
        super.comer();
    }
    public void hacerRuido(){
        super.hacerRuido();
    }
    public void vacunar(){
        System.out.println("*pinchan al gato*");
    }
}
