import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Objects;
import java.util.Scanner;

public class TreeMaps implements MapFactory{

    TreeMap<String, Producto> miMapa = new TreeMap<>();

    public void nuevoTreeMap() throws FileNotFoundException {

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
        return null;
    }

    @Override
    public String qCategoria(String producto) {
        return null;
    }

    @Override
    public String datosProducto(String producto) {
        return null;
    }

    @Override
    public String datosProductoTipo(String producto) {
        return null;
    }

    @Override
    public void showInventario() {

    }

    @Override
    public void showInventarioTipo() {

    }
}
