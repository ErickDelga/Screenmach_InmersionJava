import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido a la Inmersion Java");
        double mediaEvaluacionUsuario = 0;
        int i = 0;
        for (i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario += notaMatrix;
        }
        System.out.println("Tota global de " + i + " Usuarios= " + mediaEvaluacionUsuario);
        System.out.println("La media de la pelicula matrix calculada por el ususario es= " + mediaEvaluacionUsuario/3);
    }
}