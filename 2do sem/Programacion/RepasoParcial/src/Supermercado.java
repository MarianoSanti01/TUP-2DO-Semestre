import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private List<Producto> inventario;

    public Supermercado() {
        inventario = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void realizarCompra(Cliente cliente) {
        for (Producto producto : cliente.carrito) {
            for (Producto item : inventario) {
                if (item.getNombre().equals(producto.getNombre())) {
                    item.setCantidadStock(item.getCantidadStock() - 1);
                }
            }
        }
        cliente.carrito.clear();
    }

    public void mostrarInventario() {
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }
}