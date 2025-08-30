CLASES Y LISTAS EN JAVA 

- Ejercicio 1.
Se ha construido un diagrama UML de la aplicación, se han implementado las clases Turno y Paciente, pero nos han pedido que implementemos la clase Consultorio. Para ello tenga en cuenta que:
a) La lista de turnos debe ser inicializada vacía dentro del constructor.
b) El método agregarTurno debe crear y agregar un nuevo turno. En esta versión del sistema no es necesario chequear si ya hay turnos dados para el mismo dia y horario.

- Ejercicio 2: Implementar un método a partir de un requerimiento
Eventualmente, alguno de los consultorios se pinta. Por esa razón, es necesario cancelar todos los turnos del consultorio para el dia en que se pinta. En esta versión del sistema no se reagendarán los turnos sino que se cancelan. Indique en qué clase iría dicha funcionalidad e implemente el/los método/s necesarios para satisfacer este nuevo requerimiento. 
Suponga que la clase cuenta con el método esMismoDia(Date dia1, Date dia2) que devuelve true en caso de que los días sean iguales y false en caso de no serlo.
