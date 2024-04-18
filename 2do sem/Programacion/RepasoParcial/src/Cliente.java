import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    public List<Producto> carrito; // Cambiado a public para permitir acceso directo

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        carrito = new ArrayList<>();
    }

    public void agregarProductoAlCarrito(Producto producto) {
        carrito.add(producto);
    }

    public double calcularTotalCompra() {
        double total = 0;
        for (Producto producto : carrito) {
            total += producto.getPrecio();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}