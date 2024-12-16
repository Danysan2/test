import java.util.Scanner;

public class Main {


    public static int suma(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Digite el segundo numero");
        int num2 = teclado.nextInt();
        
        return num1 + num2;

    }

    public static void main(String[] args) {
       int resultado = suma();
    }
}
