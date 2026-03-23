// Reduccion logica
// Primero danos un numero por pantalla y depues comprobaremos si es par o es impar.
import java.util.Scanner;

public class Pg74_denis {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int numero1;
         
         System.out.println("Este numero es: ");
         numero1 = scan.nextInt();
         
         if (numero1 % 2 == 0){
             System.out.println("Es par");
         }else{
             System.out.println("Es impar");   
         }
    }
}
