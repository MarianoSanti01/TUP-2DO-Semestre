public class Felino extends Animal{
    public Felino(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }
    @Override
    public void rugir(){
        System.out.println("Miau Miau");
    }
}
