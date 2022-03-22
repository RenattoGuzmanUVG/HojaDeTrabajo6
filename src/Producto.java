public class Producto {

    private String nombreProducto;
    private String categoriaProducto;
    private int cantProducto;

    public Producto(String nombre, String categoria, int cant) {
        setNombreProducto(nombre);
        setCategoriaProducto(categoria);
        setCantProducto(cant);
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }
}
