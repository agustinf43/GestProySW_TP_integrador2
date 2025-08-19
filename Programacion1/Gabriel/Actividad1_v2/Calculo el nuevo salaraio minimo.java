public class Ejercicio2Alt {
    public static final double SALARIO_ACTUAL = 84512.0;

    public static void main(String[] args) {
        double salarioSindicato = calcularAumento(SALARIO_ACTUAL, 40);
        double salarioGobierno = calcularAumento(SALARIO_ACTUAL, 20);

        double diferencia = salarioSindicato - salarioGobierno;

        System.out.printf("Salario con aumento del sindicato: $%.2f%n", salarioSindicato);
        System.out.printf("Salario con aumento del gobierno: $%.2f%n", salarioGobierno);
        System.out.printf("Diferencia: $%.2f%n", diferencia);
    }

    public static double calcularAumento(double salario, double porcentaje) {
        return salario * (1 + porcentaje / 100);
    }
}
