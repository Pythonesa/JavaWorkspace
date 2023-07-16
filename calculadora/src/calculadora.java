import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Integer opcion = 0;
        Integer num1 = 0;
        Integer num2 = 0;
        Scanner sc = new Scanner(System.in);
        do{
            imprimirMenu();
            opcion = sc.nextInt();
            if (opcion != 0){
                System.out.printf("Ingrese el primer número: ");
                num1 = sc.nextInt();
                System.out.printf("Ingrese el segundo número: ");
                num2 = sc.nextInt();
                switch (opcion){
                    case 1:
                        Integer suma = suma(num1, num2);
                        System.out.println("El resultado de la suma es: "+suma);
                        break;
                    case 2:
                        Integer resta = resta(num1, num2);
                        System.out.println("El resultado de la resta es: "+resta);
                        break;
                    case 3:
                        Double div = division(num1, num2);
                        System.out.println("El resultado de la división es: "+div);
                        break;
                    case 4:
                        Integer mult = multiplicacion(num1, num2);
                        System.out.println("El resultado de la multiplicación es: "+mult);
                        break;
                    case 5:
                        Integer res = sumarDesdeXHastaY(num1, num2);
                        System.out.println("El resultado de sumar los números desde "+num1+" hasta "+num2+" es: "+res);
                }
            }
        }while(opcion != 0);
    }
    public static void imprimirMenu(){
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");
        System.out.println("5. Suma hasta N");
        System.out.println("0. Salir");
        System.out.printf("Ingrese la opción deseada: ");
    }
    public static Integer suma(Integer num1, Integer num2){
        return num1 + num2;
    }
    public static Integer resta(Integer num1, Integer num2){
        return num1 - num2;
    }
    public static Integer multiplicacion(Integer num1, Integer num2){
        return num1 * num2;
    }
    public static Double division(Integer num1, Integer num2){
        Double n1 = num1.doubleValue();
        Double n2 = num2.doubleValue();
        return n1/n2;
    }
    public static Integer sumarDesdeXHastaY(Integer x, Integer y){
        Integer resultado = 0;
        for (int i = x; i <= y; i++){
            resultado += i;
            System.out.println(i);
        }
        return resultado;
    }
}
