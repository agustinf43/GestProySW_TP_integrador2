## Consigna
Codificar en Java el ejercicio propuesto en el capítulo 8.  

- Crear clase `Persona`.  
- Crear clase `Empleado` que hereda de `Persona`.  
- Crear constructores, métodos *getters* y *setters*.  
- Usar `this` y `super`.  
- Incorporar un método **sobreescrito** y un método **sobrecargado**.  

---

## Descripción de la solución
- Se implementó la clase **Persona** con los atributos `nombre` y `edad`, constructores, getters y setters.  
- Se implementó la clase **Empleado** que **hereda de Persona**, agregando el atributo `sueldo`.  
- Se utilizó `super` para invocar al constructor de la clase base y `this` dentro de setters.  
- Se implementó un método **sobreescrito**: `mostrarDatos()` en `Empleado`, que extiende el comportamiento de `Persona`.  
- Se implementó un método **sobrecargado**: `mostrarDatos(boolean conSaludo)`, que muestra los datos con un saludo opcional.  
- Se creó la clase **Main** para instanciar objetos y probar el funcionamiento de la herencia, los constructores y los métodos.  
