package colleciones;

import entities.Alumno;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetsAlumnos {
    public static void main(String[] args) {

//HASHSET son coleciones de datos sin duplicados
        HashSet<Alumno> setAlumnos = new HashSet<>();
        setAlumnos.add(new Alumno("Matias", "Gomez", "23434235", 1));
        setAlumnos.add(new Alumno("Agustin", "Fernandez", "23547457", 2));
        setAlumnos.add(new Alumno("Elian", "Kunze", "566583423", 3));
        setAlumnos.add(new Alumno("Gabriel", "Rivero", "23434235", 4));
        setAlumnos.add(new Alumno("Matias", "Gomez", "23434235", 1));

        //metodo que muestra los alumnos creados usando while
        Iterator it = setAlumnos.iterator();
        while (it.hasNext()) {
            Alumno alumno = (Alumno) it.next();
            System.out.println(alumno.toString());
        }
        //metodo que hace lo mismo, pero usando for
        for (Alumno persona : setAlumnos) {
            System.out.println(persona.toString());
        }
        //CONTAINS
        Alumno matias = new Alumno("Matias", "Gomez", "23434235", 1);
        System.out.println("Esta Matias?: " + setAlumnos.contains(matias));

        //CLEAR elimina todos los elementos de una coleccion/lista
        //setAlumnos.clear();

        //SIZE determina la cantidad de elementos que posee una lista
        System.out.println("Cantidad de alumnos: " + setAlumnos.size());
        //isEmpty determina si una lista esta vacia o no y devuelve true o false
        System.out.println("Esta vacia? " + setAlumnos.isEmpty());
        //REMOVE elimina un elemento en especifico de la coleccion
        setAlumnos.remove(new Alumno("Agustin", "Fernandez", "23547457", 2));


        it = setAlumnos.iterator();
        while (it.hasNext()) {
            Alumno alumno = (Alumno) it.next();
            System.out.println(alumno.toString());
        }

        //convierto el set en un array
        Alumno[] alumnoArray = setAlumnos.toArray(new Alumno[0]);
        //muestra el array
        System.out.println(Arrays.toString(alumnoArray));


        System.out.println("----------------------TREESET---------------------");
        TreeSet<String> setLenguajes = new TreeSet<>();

        setLenguajes.add("Java");
        setLenguajes.add("HTML");
        setLenguajes.add("Phyton");
        setLenguajes.add("Phyton");
        setLenguajes.add("C++");
        setLenguajes.add("Cobol");
        setLenguajes.add("Java");

        for (String lenguaje : setLenguajes) {
            System.out.println(lenguaje);
        }
        System.out.println("El treeset contiene: " + setLenguajes.size() + " lenguajes");

        System.out.println("---------------------treeset de alumnos ordenado--------------------------");
        //alumno debe implementar la interfaz comparable y el metodo compareTo
        TreeSet<Alumno> treeAlumnos = new TreeSet<>();
        treeAlumnos.add(new Alumno("Matias", "Gomez", "23434235", 1));
        treeAlumnos.add(new Alumno("Agustin", "Fernandez", "M44444444444", 2));
        treeAlumnos.add(new Alumno("Martin", "Fernandez", "F111111111", 2));
        treeAlumnos.add(new Alumno("Elian", "Kunze", "222222222", 3));
        treeAlumnos.add(new Alumno("Gabriel", "Rivero", "333333333", 4));
        treeAlumnos.add(new Alumno("Matias", "Gomez", "23434235", 1));

        for(Alumno alumno:treeAlumnos){
            System.out.println(alumno.toString());
        }

    }//cierra main
}//cierra clase