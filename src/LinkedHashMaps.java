import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LinkedHashMaps implements MapFactory{

    LinkedHashMap<String, Producto> miMapa = new LinkedHashMap<>();

    public void nuevoLinkedHashMap() throws FileNotFoundException {

        Lector l = new Lector();
        ArrayList<String> lista = l.lector();

        for (int i = 0; i < lista.size(); i++) {
            String linea = lista.get(i);
            String[] texto = linea.split("\\|");

            String categoria = texto[0];
            String producto = texto[1];

            int wrc = 1;

            for(int j = i+1 ; j < lista.size() ; j++) //Inner loop for Comparison
            {
                String lineaJ = lista.get(j);
                String[] textoJ = linea.split("\\|");
                String productoJ = textoJ[0];

                if(producto.equals(productoJ)) //Checking for both strings are equal
                {
                    wrc= wrc + 1;    //if equal increment the count
                    productoJ = "0"; //Replace repeated words by zero
                }
            }
            if (!Objects.equals(producto, "0")) {
                miMapa.put(producto , new Producto(producto,categoria , wrc));
            }
        }

    }



    @Override
    public String agregarProducto(String nombre, String categ) {
        miMapa.put(nombre , new Producto(nombre,categ , 1));

        return "Producto agregado";
    }

    @Override
    public String qCategoria(String producto) {

        if (miMapa.containsKey(" " + producto)){
            Producto valor = miMapa.get(" " + producto);
            return valor.getCategoriaProducto();
        }
        else {
            return "No hay un producto llamado así";
        }

    }

    @Override
    public String datosProducto(String producto) {
        if (miMapa.containsKey(" " + producto)){
            Producto valor = miMapa.get(" " + producto);

            String categoria = valor.getCategoriaProducto();
            int cantidad = valor.getCantProducto();

            String texto = "Producto: " + producto + "  Categoría: " + categoria + "cantidad" + cantidad ;
            return texto;
        }
        else {
            return "No hay un producto llamado así";
        }
    }

    @Override
    public String datosProductoTipo(String producto) {
        if (miMapa.containsKey(" " + producto)){
            Producto valor = miMapa.get(" " + producto);

            String categoria = valor.getCategoriaProducto();
            int cantidad = valor.getCantProducto();

            String texto = "Producto: " + producto + "  Categoría: " + categoria + "Cantidad: " + cantidad ;
            return texto;
        }
        else {
            return "No hay un producto llamado así";
        }
    }

    @Override
    public void showInventario() {
        for (String key: miMapa.keySet()) {
            System.out.println( key );
        }
    }

    @Override
    public void showInventarioTipo() {
        for (String key: miMapa.keySet()) {
            System.out.println( key );
        }
    }
}
