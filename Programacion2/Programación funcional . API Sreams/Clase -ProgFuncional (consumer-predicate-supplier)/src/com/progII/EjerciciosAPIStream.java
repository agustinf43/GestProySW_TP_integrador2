package com.progII;

import com.progII.model.Genero;
import com.progII.model.Persona;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjerciciosAPIStream {
    public static void main(String[] args) {

        //COMPARATOR.COMPARING
        //COLLECT

        List<Persona> personas = List.of(
                new Persona(1, "Juan", 20, Genero.MASCULINO, 55000),
                new Persona(2, "Carlos", 25, Genero.MASCULINO, 50000),
                new Persona(3, "Agustina", 30, Genero.FEMENINO, 40000),
                new Persona(4, "Ariel", 50, Genero.MASCULINO, 125000),
                new Persona(5, "Ruben", 35, Genero.MASCULINO, 25000),
                new Persona(6, "Ana", 16, Genero.FEMENINO, 25000),
                new Persona(7, "Maria", 34, Genero.FEMENINO, 55000),
                new Persona(8, "Maria", 44, Genero.FEMENINO, 174000),
                new Persona(9, "sofia", 10, Genero.FEMENINO, 0),
                new Persona(10, "Claudio", 18, Genero.MASCULINO, 50000),
                new Persona(11, "juan", 35, Genero.MASCULINO, 150000)
        );

        //1. Filtrar personas mayores de 30 años
        System.out.println("-----------------Persona MAYORES de 30 años: ");

        personas.stream()
                .filter(e -> e.getEdad() > 30)
                .forEach(e -> System.out.println(e.getNombre()));

        //2. Obtener los nombres de todas las personas, sin duplicados
        System.out.println("----------------Nombres sin duplicar: ");
        /*personas.stream()
                .distinct(Comparator.comparing(p -> p.getNombre))
                .forEach(System.out::println);*/

        /*personas.stream()
                .distinct(p ->p.getNombre())
                .forEach(e -> System.out.println(e.getNombre()));*/

        //3. Ordenar las personas por edad de menor a mayor
        System.out.println("---------------Orden por edad de MENOR a MAYOR: ");
        personas.stream()
                .sorted(Comparator.comparing(Persona::getEdad))
                .forEach(e -> System.out.println(e.getNombre() + " - " + e.getEdad()));


        personas.stream()
                .sorted(Comparator.comparing(e -> e.getEdad()))
                .forEach(e -> System.out.println(e.getNombre() + " - " + e.getEdad()));

        //4. Calcular el salario promedio
        ///
        System.out.println("---------------Calculo de salario promedio: ");
        double promedio = personas.stream()
                .mapToDouble(Persona::getSalario)
                .average()
                .orElse(0.0);

        System.out.println("El salario promedio es: " + promedio);

        //5. Agrupar personas por género
        //metodo 1
        System.out.println("Agrupar personas por GENERO: ");
        personas.stream()
                .collect(Collectors.groupingBy(Persona::getGenero))
                .forEach((genero, nombre) -> System.out.println("lista: " + genero + ": " + nombre));
//metodo 2
        System.out.println("Agrupar personas por GENERO: ");
        Map<Genero, List<Persona>> mapaPersonas = personas.stream()
                .collect(Collectors.groupingBy(Persona::getGenero));
        mapaPersonas.forEach((genero, nombre) -> System.out.println("lista: " + genero + ": " + nombre));

        //6. Contar cuántas personas hay por cada edad
        ///
        System.out.println("contar cantidad de personas por edad: ");
        personas.stream()
                .collect(Collectors.groupingBy(Persona::getEdad, Collectors.counting()))
                .forEach((edad, cantidad) -> System.out.println("edad: " + edad + ": cantidad: " + cantidad));

        //7. Obtener la persona con mayor salario
        ///
        System.out.println("Persona con mayor salario: ");
        personas.stream()
                .max(Comparator.comparing(Persona::getSalario))
                .ifPresent(persona ->
                        System.out.println(persona.getNombre() +
                                " - " + persona.getSalario()));


        //8. Verificar si hay alguna persona con salario mayor a 100,000
        System.out.println("Persona con salario mayor a 100000: ");

        personas.stream()
                .filter(persona -> persona.getSalario() > 100000)
                .forEach(e -> System.out.println("Nombre: " + e.getNombre() + " -> Salario: " + e.getSalario()));


        //9. Crear una lista de los nombres en mayúsculas de las personas menores de 25

        System.out.println("-----------------------Lista de nombres en mayusculas de personas menores de 25: ");
        List<String> nombresMayusculas =
                personas.stream()
                        .filter(persona -> persona.getEdad() < 25)
                        .map(persona -> persona.getNombre().toUpperCase())
                        .collect(Collectors.toList());

        nombresMayusculas.forEach(System.out::println);

        //10. Particionar las personas según si ganan más de $50,000
        System.out.println("----------------------Personas que ganan mas de 50000$: ");

        personas.stream()
                .filter(persona -> persona.getSalario() > 50000)
                .forEach(e -> System.out.println("Nombre: " + e.getNombre() + " -> Salario: " + e.getSalario()));


        //NOTA;
        //si deseo guardar los cambios/consultas en lista uso collectors.toList


    }//cierra main
}//cierra clase
