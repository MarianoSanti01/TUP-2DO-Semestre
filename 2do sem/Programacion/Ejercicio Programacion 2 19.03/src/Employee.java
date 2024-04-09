
public abstract class Employee {
    private String nombre;
    private String apellido;

    private double salario;

    public Employee (String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public Employee (String nombre, String apellido , double salario ) {
        this.nombre =  nombre;
        this.apellido = apellido;
        this.salario = salario;


    }

    public void setApellido(String apellido) {
        this.apellido = apellido;

    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void mostrarDatos2() {
        System.out.println("Nombre: " + nombre + " apellido: " + apellido +  " - Salario: " + salario);
    }

}