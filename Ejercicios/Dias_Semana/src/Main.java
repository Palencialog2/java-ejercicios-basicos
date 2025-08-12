//Programa para mostrar el día de la semana
//Autor: Ángel Palencia
//Práctica del libro: "El gran libro de Java a fondo"


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creamos un Scanner para leer la entrada del usuario desde consola
        Scanner scanner = new Scanner(System.in);

        //Solicitamos al usuario que ingrese el día de la semana
        System.out.println("Por favor ingrese, en número, un día de la semana: ");
        int v = scanner.nextInt();

        // Variable que almacenará el nombre del día correspondiente al número ingresado
        String dia;

        //Determinar día según número ingresado
        switch (v) {
            //incluimos todos los posibles cases
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default: //en caso de error
                dia = "Día incorrecto... Por favor, ingrese un número entre el 1 y el 7.";
        }
        // Mostramos el resultado elegido
        System.out.println("Usted ha seleccionado: " + dia);
    }
}