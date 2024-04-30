import java.util.Scanner;

public class DesafioConElWhile {
    public static void main(String[] args) {
        double mediaEvaluacionUsuario = 0;
        int i = 0;
        while (i < 5){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario += notaMatrix;
            i++;
        }
        System.out.println("Tota global de " + i + " Usuarios= " + mediaEvaluacionUsuario);
        System.out.println("La media de la pelicula matrix calculada por el ususario es= " + mediaEvaluacionUsuario/i);
    }
}
