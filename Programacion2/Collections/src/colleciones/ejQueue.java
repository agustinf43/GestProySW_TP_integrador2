package colleciones;

import entities.Alumno;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ejQueue {
    public static void main(String[] args) {

        ArrayDeque<Alumno> queueAlumnos = new ArrayDeque<>();

        queueAlumnos.offer(new Alumno("Juan", "Gonzalez", "12345678", 1));
        Alumno alumno2 = new Alumno("Jose", "lopez", "22233325", 2);
        queueAlumnos.offer(alumno2);
        queueAlumnos.offer(new Alumno("Maria", "Serra", "88855522", 3));

        queueAlumnos.offerFirst(new Alumno("primer", "alumno", "11111111", 0));
        queueAlumnos.offerLast(new Alumno("ultimo", "alumno", "88888888", 6));

        for (Alumno alumno : queueAlumnos) {
            System.out.println(alumno.toString());
        }

        while (!queueAlumnos.isEmpty()) {
            System.out.println(queueAlumnos.peek().toString());
           //POLL elimina los elementos de la lista
            queueAlumnos.poll();
        }

        System.out.println("tamanio de la queue: "+queueAlumnos.size());
        System.out.println("esta vacia?: "+queueAlumnos.isEmpty());


    }//cierra main

}//cierra clase
