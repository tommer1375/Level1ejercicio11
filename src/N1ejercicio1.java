
import java.util.ArrayList;
import java.util.Scanner;

public class N1ejercicio1 {

    public static void main(String[] args) {

        ArrayList<Instrumentos> instrumentoMusica = new ArrayList<Instrumentos>();

        int opcion=-1;
        while (opcion !=0) {
            opcion = menuPrograma(instrumentoMusica);
            menuInstrumentos(opcion,instrumentoMusica);
            System.out.println();
        }
    }
    static int menuPrograma(ArrayList<Instrumentos>instrumentoMusica) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Programa de Instrumentos de música");
        System.out.println();
        System.out.println("1 - Añadir Instrumentos");
        System.out.println("2 - Mostrar instrumentos");
        System.out.println("3 - Tocar instrumentos");
        System.out.println("0 - Salir del programa");
        System.out.print("Elige unas de las siguientes operaciones: ");
        int opcion = myObj.nextInt();

        return opcion;

    }
    static void  menuInstrumentos (int eleccion, ArrayList<Instrumentos>instrumentoMusica) {

        String nombreInstrumento;


        switch (eleccion) {

            case 1:
                crearInstrumento(instrumentoMusica);
                break;

            case 2:
                listaInstrumentos(instrumentoMusica);
                break;
            case 3:
                nombreInstrumento = pedirDato("Introduce el nombre del Instrumento: ");
                tocarInstrumento (instrumentoMusica, nombreInstrumento);
                break;

            case 0:
                System.out.println("Has salido del prorama");
                break;

            default:

                System.out.println ("No has puesto una opción válida");
        }
    }
    static void crearInstrumento(ArrayList<Instrumentos>instrumentoMusica) {

        Instrumentos nuevoInstrumento;

        String nombreInstrumento = pedirDato("Introduce el nombre: ");
        int precio = pedirDatoN("Introduce el precio del instrumento: ");
        int tipoInstrumento = pedirDatoN("Introduce el tipo de instrumento (1-Cuerda||2-Viento||3-Percusión): ");


        switch (tipoInstrumento) {
            case 1:

                nuevoInstrumento = new Cuerda(nombreInstrumento, precio);
                break;

            case 2:
                nuevoInstrumento = new Viento(nombreInstrumento, precio);
                break;

            case 3:
                nuevoInstrumento = new Percusion(nombreInstrumento, precio);
                break;

            default:
                System.out.println("Tipo de instrumento no válido.");
                return;
        }

        instrumentoMusica.add(nuevoInstrumento);



    }


    static void listaInstrumentos (ArrayList<Instrumentos> instrumentoMusica) {

        int i;
        for (i=0; i<instrumentoMusica.size(); i++) {
            System.out.print(instrumentoMusica.get(i));
            System.out.println();
        }

    }

    static void tocarInstrumento (ArrayList<Instrumentos> instrumentoMusica, String nombreInstrumento) {



        int resultado = comprobarInstrumento (instrumentoMusica, nombreInstrumento);
        if (resultado !=-1) {

            int tipoInstrumento = instrumentoMusica.get(resultado).gettipoInstrumento();

            if (tipoInstrumento==1) {
                ((Cuerda) instrumentoMusica.get(resultado)).tocar();

            }else if (tipoInstrumento==2) {
                ((Viento) instrumentoMusica.get(resultado)).tocar();

            }else if (tipoInstrumento==3) {
                ((Percusion) instrumentoMusica.get(resultado)).tocar();

            }

        }
        if (resultado == -1) {
            System.out.println();
            System.out.print("No hemos encontrado el instrumento");

        }

    }
    static Integer comprobarInstrumento (ArrayList<Instrumentos> instrumentoMusica, String nombreInstrumento) {

        int indice = 0;
        int resultado = -1;

        while (resultado ==-1 && indice < instrumentoMusica.size()) {
            if (instrumentoMusica.get(indice).getNombre().equals(nombreInstrumento)) {

                resultado = indice;
            }
            indice++;
        }
        return resultado;

    }

    static String pedirDato (String palabra) {

        Scanner myObj = new Scanner(System.in);
        System.out.println();
        System.out.print(palabra);
        String datoString = myObj.nextLine();
        String datoStringF = datoString.toUpperCase();
        return datoStringF;

    }
    static Integer pedirDatoN (String palabra) {

        Scanner myObj = new Scanner(System.in);
        System.out.println();
        System.out.print(palabra);
        int pedirDato = myObj.nextInt();
        return pedirDato;


    }

}
