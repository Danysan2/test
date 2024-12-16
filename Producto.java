import java.util.Scanner;

public class Producto {
<<<<<<< HEAD
    public static void producto(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Digite el segundo numero");
        int num2 = teclado.nextInt();

        int resultado = num1 * num2;
        System.out.println(resultado);

=======
    public static int producto(int number1 , int number2) {
        return number1 * number2;
>>>>>>> main
    }
}
