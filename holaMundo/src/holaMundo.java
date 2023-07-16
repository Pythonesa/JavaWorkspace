import java.util.Scanner;

public class holaMundo {
    public static void main(String[] args) {
        System.out.printf("Ingresa tu nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.printf("Ingresa tu edad: ");
        Integer edad = sc.nextInt();
        Boolean mayor = esMayor(edad);
        System.out.println("Hola, "+nombre+" ! Tienes "+edad+" años.");
        if (mayor && (edad >= 0 && edad <= 130)){
            System.out.println("Eres mayor de edad.");
        } else if (edad >= 0 && edad <= 130){
            System.out.println("Eres menor de edad.");
        }
        else{
            System.out.println("¡Oiga! No mienta con su edad.");
        }
    }

    public static Boolean esMayor(Integer edad){
        return edad >= 18;
    }
}
