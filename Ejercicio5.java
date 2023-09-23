import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diasT = 0;
        double ventasT = 0;
        try {
            System.out.println("Para cuantos dias tienes cifras de ventas?");
            diasT = scanner.nextInt();
            if (diasT < 0) {
                System.out.println("el numero ingresado es incorrecto. Ingrese un numero mayor o igual a 1");
                System.exit(0);
            }
            for (int i = 1; i <= diasT; i++) {
                System.out.println("Ingresa las ventas para el dia " + i + ":");
                double ventasDia = scanner.nextDouble();

                if (ventasDia < 0) {
                    System.out.println("el numero ingresado es incorrecto,ponga un numero positivo");
                    System.exit(0);
                }
                ventasT += ventasDia;
            }
            System.out.printf("Las ventas totales son S/ %.2f", ventasT);

        } catch (Exception e) {
            System.out.println("Disculpa, el numero ingresado es incorrecto. Ingrese un número mayor o igual a 1.");
            System.exit(0);
        }
    }
}
