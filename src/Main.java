import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        while (exit == false){

            System.out.println("Bienvenido, a la aplicación de la tienda online ");

            System.out.println("Por favor elija una de las siguientes opciones: ");
            System.out.println("1. HashMap\n2. TreeMap\n3. LinkedHashMap");
            int tipoDeMap = sc.nextInt();

            System.out.println("¿Qué desea hacer? \nPor favor elija una de las siguientes opciones: ");
            System.out.println("1. Agregar  un  producto a  la colección\n2. Mostrar la categoría de un producto\n3. Mostrar  los  datos  de un  producto");

            switch(tipoDeMap)
            {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

            }
        }

    }
}
