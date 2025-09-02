package com.progII;

import com.progII.model.Genero;
import com.progII.model.Persona;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class listaPersonas {
    public static void main(String[] args) {

//se crea una lista de personas de tipo Persona(esta posee id, nombre, edad y genero)
        List<Persona> personas = List.of(
                new Persona(1, "Elian", 20, Genero.MASCULINO),
                new Persona(2, "Gabriel", 25, Genero.MASCULINO),
                new Persona(3, "Agustin", 30, Genero.MASCULINO),
                new Persona(7, "Ariel", 20, Genero.MASCULINO),
                new Persona(4, "Ariel", 35, Genero.MASCULINO),
                new Persona(5, "Ana", 16, Genero.FEMENINO),
                new Persona(6, "Maria", 14, Genero.FEMENINO)
        );
        /*
        //metodo IMPERATIVO:
        //se define paso a paso lo que se quiere hacer

        for (Persona persona: personas) {
            System.out.println(persona.toString());
        }*/

        //metodo FUNCIONAL:
        //se define lo que se quiere hacer, no como se hace
        personas.stream().forEach(getPersonayMostrar());


        //EXTRA:
        //metodo para extraer FUNCIONES (btn Der. - refractor-extract method)
        List<Persona> masculino =
                personas.stream()
                .filter(getPersonaMasculino())
                .collect(Collectors.toList());

        System.out.println("-----------------Lista de personas masculino--------------");
        masculino.stream().forEach(getPersonayMostrar());

        //ALLMATCH
        System.out.println("________________Son todos MASCULINOS: "
                + masculino.stream().allMatch(p -> p.getGenero() == Genero.MASCULINO)
        );
        System.out.println("_________________Son todos FEMENINOS: "
                + personas.stream().allMatch(p -> p.getGenero() == Genero.FEMENINO)
        );
        System.out.println("_________________Hay alguna persona de genero MASCULINO? "
                + personas.stream().allMatch(p -> p.getGenero() == Genero.MASCULINO)
        );
        //ANYMATCH
        System.out.println("_________________Son todos mayores de 18: "
                + personas.stream().anyMatch(p -> p.getEdad() < 18)
        );
        System.out.println("_________________Hay algun ARIEL en la lista? "
                + personas.stream().anyMatch(p -> p.getNombre().toUpperCase().equals("Ariel"))
        );
        //NONEMATCH
        System.out.println("_________________Hay algun MENDIETA en la lista? "
                + personas.stream().noneMatch(p -> p.getNombre().toUpperCase().equals("MENDIETA"))
        );
        //MAX
        System.out.println("_________________persona de MAYOR edad");
        personas.stream().
                max(Comparator.comparing(Persona::getEdad))
                .ifPresent(System.out::println);

        //MIN
        System.out.println("_________________persona de MENOR edad");
        personas.stream().
                min(Comparator.comparing(Persona::getEdad))
                .ifPresent(System.out::println);


        System.out.println("_________________Lista de nombres en MAYUSCULA");
        //MAP transforma los datos de la lista
        //en este caso transforma el nombre a mayuscula
        List<String> nombresMay = personas.stream()
                .map(getPersonaStringFunction()).collect(Collectors.toList());

        nombresMay.stream().forEach(System.out::println);

        System.out.println("________________LARGO de los nombres");
        //
        List<Integer> largoNombre = personas.stream()
                .map(p -> p.getNombre().length())
                .distinct()
                .collect(Collectors.toList());

        largoNombre.stream().forEach(System.out::println);

        Optional<Integer> max = personas.stream()
                .map(p -> p.getNombre().length())
                .distinct()
                .max(Integer::compareTo);

        System.out.println("__________________-El mas largo es: " + max.orElse(0));

        //SORT: sirve para ordenar
        System.out.println("________________________-Lista ORDENADA por nombre");
        List<Persona> listaOrdenada = personas.stream()
                .sorted(Comparator.comparing(p -> p.getNombre()))
                .collect(Collectors.toList());

        listaOrdenada.stream().forEach(System.out::println);

        System.out.println("__________________Lista ORDENADA por nombre  DESCENDENTE y EDAD");
        List<Persona> listaOrdenada2 = personas.stream()
                .sorted(Comparator.comparing(Persona::getNombre)
                        .reversed()
                        .thenComparing(Comparator.comparing(Persona::getEdad)))
                .collect(Collectors.toList());

        listaOrdenada2.stream().forEach(System.out::println);

        //AGRUPAR DATOS
        //2 agrupaciones de personas por genero
        System.out.println("____________Mostrando el mapa de personas AGRUPADO POR GENERO");
        Map<Genero, List<Persona>> mapPersonaPorGenero
                = personas.stream()
                .collect(Collectors.groupingBy(Persona::getGenero));

        mapPersonaPorGenero.forEach((genero, persona) -> {
            System.out.println(genero);
            persona.forEach(System.out::println);
        });

        //metodo ITERATE:

        System.out.println("____________filtrar empleados con salario mayor a 50000");
        List<Persona> empleados = List.of(new Persona(1, "Juan", 30000),
                new Persona(2, "Pedro", 70000),
                new Persona(3, "Mary", 80000));

        empleados.stream()
                .filter(e -> e.getSalario() > 5000)
                .forEach(e -> System.out.println(e.getNombre()));

        System.out.println("____________filtrar empleados con salario AUMENTADO UN 1O%");
        List<Persona> empleadosConAumento = empleados.stream().
                map(p -> new Persona(p.getId(), p.getNombre(), p.getSalario() * 1.1))
                .collect(Collectors.toList());

        empleadosConAumento.forEach(System.out::println);

        System.out.println("____________empleado mejor pagado");
        Optional<Persona> mejorPagado = empleados.stream().
                max(Comparator.comparingDouble(Persona::getSalario));
        System.out.println("El empleado mejor pago es: "+mejorPagado);



        String nombre=empleados.stream()
                        .max(Comparator.comparing(p ->p.getNombre().length()))
                                .get().getNombre();
        System.out.println("--------------------nombre mas largo es: "+nombre);










    }//cierra main

    //metodo para extraer FUNCIONES (btn Derecho -> refractor -> extract method)
    private static Function<Persona, String> getPersonaStringFunction() {
        return (p) -> p.getNombre().toUpperCase();
    }

    private static Predicate<Persona> getPersonaMasculino() {
        return p -> p.getGenero() == Genero.MASCULINO;
    }

    private static Consumer<Persona> getPersonayMostrar() {
        //return p -> System.out.println(p.toString());
        return System.out::println;
    }

}//cierra clase
