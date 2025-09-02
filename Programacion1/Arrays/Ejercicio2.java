// Ejercicio 2
    public static void ejercicio2() {
        System.out.println("=== EJERCICIO 2 ===");
        Scanner sc = new Scanner(System.in);
        String[] vector = new String[5];
        String[] vectorInvertido = new String[5];

        System.out.println("Ingrese 5 palabras:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextLine();
        }

        for (int i = 0; i < vector.length; i++) {
            vectorInvertido[i] = vector[vector.length - 1 - i];
        }

        System.out.println("Vector invertido:");
        for (String palabra : vectorInvertido) {
            System.out.println(palabra);
        }
        System.out.println();
    }