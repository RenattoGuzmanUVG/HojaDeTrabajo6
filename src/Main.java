import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        Lector l = new Lector();

        HashMaps map = new HashMaps();
        map.nuevoHashMap();

        TreeMaps mapi = new TreeMaps();
        mapi.nuevoTreeMap();

        LinkedHashMaps mapit = new LinkedHashMaps();
        mapit.nuevoLinkedHashMap();



        while (!exit){

            System.out.println("Bienvenido, a la aplicación de la tienda online ");

            System.out.println("Por favor elija una de las siguientes opciones: ");
            System.out.println("1. HashMap\n2. TreeMap\n3. LinkedHashMap\n4) Salir");
            int tipoDeMap = sc.nextInt();



            switch(tipoDeMap)
            {
                case 1:
                    System.out.println("¿Qué desea hacer? \nPor favor elija una de las siguientes opciones: ");
                    System.out.println("a. Agregar  un  producto a  la colección\nb. Mostrar la categoría de un producto\nc. Mostrar  los  datos  de un  producto \nd) Mostrar  los  datos  de un  producto por tipo \ne) Mostrar inventario \nf) Mostrar inventario por tipo ");
                    String accion = sc.next();



                    if (accion.equals("a")){
                        System.out.println("Ingrese el nombre del producto a ingresar: ");
                        String nombre = " " + sc.next();
                        System.out.println("Ingrese la categoria del producto a ingresar: ");
                        String categ = " " + sc.next();

                        System.out.println(map.agregarProducto(nombre,categ));
                    }

                    else if (accion.equals("b")){
                        map.showInventario();

                        System.out.println("Ingrese el nombre de su producto: ");
                        String nomb = sc.next();

                        System.out.println(map.qCategoria(nomb));
                    }
                    else if (accion.equals("c")) {
                        map.showInventario();

                        System.out.println("Ingrese el nombre de su producto: ");
                        String nomb = sc.next();

                        System.out.println(map.datosProducto(nomb));
                    }
                    else if (accion.equals("d")){
                        map.showInventario();

                        System.out.println("Ingrese el nombre de su producto: ");
                        String nomb = sc.next();

                        System.out.println(map.datosProductoTipo(nomb));
                    }
                    else if (accion.equals("e")){
                        System.out.println("Mostrando Inventario");
                        map.showInventario();
                    }
                    else if (accion.equals("f")){
                        System.out.println("Mostrando Inventario Por Tipo");
                        map.showInventarioTipo();
                    }
                    
                    break;

                case 2:


                    break;

                case 3:
                    break;

                case 4:
                    exit = true;
                    break;

            }
        }

    }
}
