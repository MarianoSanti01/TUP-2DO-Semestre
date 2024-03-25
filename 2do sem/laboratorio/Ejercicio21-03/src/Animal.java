public abstract class Animal {
    private String foto;
    private String comida;
    private String localizacion;
    private String tamano;

    public Animal(String foto, String comida, String localizacion, String tamano) {
        this.foto = foto;
        this.comida = comida;
        this.localizacion = localizacion;
        this.tamano = tamano;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    public void hacerRuido(){
        System.out.println("*Hace quilombo*");

    }
    public void comer(){
        System.out.println("*Come*");
    }
    public void dormir(){
        System.out.println("*Duerme*");

    }
    public void rugir(){
        System.out.println("*Ruge*");}



}
