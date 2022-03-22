public interface MapFactory {

String agregarProducto(String nombre, String categ); // a) agregar un producto al mapa

String qCategoria(String producto);    // b) Ver la categoría El usuario ingresa el producto

String datosProducto(String producto); // c) Mostrar los datos del producto

String datosProductoTipo(String producto); // d) Mostrar los datos del producto por tipo

void showInventario();    // e) Mostrar inventario

void showInventarioTipo();    // f) Mostrar inventario por tipo


}
