    // Ejercicio 3
    public static void ejercicio3() {
        System.out.println("=== EJERCICIO 3 ===");
        Scanner sc = new Scanner(System.in);

        String[] meses = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] diasMes = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        System.out.print("Ingrese un número de mes (1-12): ");
        int numeroMes = sc.nextInt();

        if (numeroMes >= 1 && numeroMes <= 12) {
            System.out.println("Mes: " + meses[numeroMes - 1] + " | Días: " + diasMes[numeroMes - 1]);
        } else {
            System.out.println("Número de mes inválido.");
        }
    }