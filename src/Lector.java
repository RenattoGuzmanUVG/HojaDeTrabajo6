import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Lector {


    public ArrayList<String> lector() throws FileNotFoundException {
        File file = new File("ListadoProducto.txt");
        Scanner sc = new Scanner(file);
        ArrayList<String> textos = new ArrayList<String>();

        try {
            while(sc.hasNextLine()){
                textos.add(sc.nextLine());
            }
        }
        catch (Exception e) {
            System.out.println("El archivo no se encontro");
            textos.clear();
        }
        return textos;
    }
}
