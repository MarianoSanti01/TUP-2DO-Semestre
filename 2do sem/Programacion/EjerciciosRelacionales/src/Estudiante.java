class Estudiante {
    private String nombre;
    private Universidad universidad;

    public Estudiante(String nombre, Universidad universidad) {
        this.nombre = nombre;
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void cambiarUniversidad(Universidad nuevaUniversidad) {
        this.universidad = nuevaUniversidad;
    }
}