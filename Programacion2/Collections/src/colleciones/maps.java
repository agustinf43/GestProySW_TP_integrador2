package colleciones;

import entities.Alumno;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class maps {
    public static void main(String[] args) {

       // HashMap<String, Alumno> mapaAlumno = new HashMap<>();
        TreeMap<String, Alumno> mapaAlumno = new TreeMap<>();

        Alumno alumno1 = new Alumno("Matias", "Gomez", "23434235", 1);
        Alumno alumno2 = new Alumno("Agustin", "Fernandez", "M44444444444", 2);
        Alumno alumno3 = new Alumno("Martin", "Fernandez", "F111111111", 2);
        Alumno alumno4 = new Alumno("Elian", "Kunze", "222222222", 3);
        Alumno alumno5 = new Alumno("Gabriel", "Rivero", "333333333", 4);
        Alumno alumno6 = new Alumno("Matias", "Gomez", "23434235", 1);

        //agregar a maps
       // mapaAlumno.put(null,alumno1);
        mapaAlumno.put("44444444",alumno2);
        mapaAlumno.put("11111111",alumno3);
        mapaAlumno.put("22222222",alumno4);
        mapaAlumno.put("33333333",alumno5);
        mapaAlumno.put("12345678",alumno6);

        //valor a partir de la clave
        System.out.println("El alumno con clave 333333333 es: "+mapaAlumno.get("33333333").toString());

        //contiene value
        System.out.println("Esta el alumno 6? "+mapaAlumno.containsValue(alumno6));

        //contiene key
        System.out.println("Esta el alumno con clave 22222222? "+mapaAlumno.containsKey("22222222"));

        //eliminar por clave
        mapaAlumno.remove("22222222");

        //contiene key
        System.out.println("Esta el alumno con clave 22222222? "+mapaAlumno.containsKey("22222222"));

        //entrySet conjunto de entradas que tiene el mapa
        for(Map.Entry<String, Alumno> entrada:mapaAlumno.entrySet()) {
            System.out.println("Clave: "+entrada.getKey());
            System.out.println("Valor: "+entrada.getValue());
        }

        System.out.println("primera key: "+mapaAlumno.firstEntry());
        System.out.println("ultima key: "+mapaAlumno.lastEntry());

        System.out.println(mapaAlumno.firstKey().getValue().toString());
        System.out.println(mapaAlumno.lastKey().getValue().toString());

    }//cierra main
}//cierra clase
