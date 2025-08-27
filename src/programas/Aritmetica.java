
package programas;
import java.util.Scanner;
public class Aritmetica {
    public static void main(String[] args){
        //declarando vareiables
        double numero1, numero2, suma, promedio;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresa el numero 1: ");
        numero1=lectura.nextDouble();
        System.out.println("Ingresa el numero 2: ");
        numero2=lectura.nextDouble();
        System.out.println("Resultados de la aplicacion");        
        //proceso de datpos
        suma=numero1+numero2;
        promedio=suma/2;
        //salida de datos
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+promedio);


    }
}
