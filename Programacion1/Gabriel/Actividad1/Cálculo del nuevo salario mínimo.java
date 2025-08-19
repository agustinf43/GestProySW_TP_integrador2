public class Ejercicio2 {
    public static void main(String[] args) {
        final double SALARIO_ACTUAL = 84512.0;

        double salarioSindicato = SALARIO_ACTUAL + (SALARIO_ACTUAL * 0.40);
        double salarioGobierno = SALARIO_ACTUAL + (SALARIO_ACTUAL * 0.20);

        double diferencia = salarioSindicato - salarioGobierno;

        System.out.println("Salario con aumento del sindicato: $" + salarioSindicato);
        System.out.println("Salario con aumento del gobierno: $" + salarioGobierno);
        System.out.println("Diferencia: $" + diferencia);
    }
}

