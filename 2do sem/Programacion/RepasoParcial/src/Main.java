public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto("Leche", 2.5, 10);
        Producto producto2 = new Producto("Pan", 1.0, 20);
        Producto producto3 = new Producto("Huevos", 3.0, 15);

        // Crear supermercado
        Supermercado supermercado = new Supermercado();
        supermercado.agregarProducto(producto1);
        supermercado.agregarProducto(producto2);
        supermercado.agregarProducto(producto3);

        // Crear cliente
        Cliente cliente1 = new Cliente("Juan", "Perez");
        cliente1.agregarProductoAlCarrito(producto1);
        cliente1.agregarProductoAlCarrito(producto2);

        // Realizar compra
        supermercado.realizarCompra(cliente1);

        // Mostrar inventario después de la compra
        supermercado.mostrarInventario();
    }
}