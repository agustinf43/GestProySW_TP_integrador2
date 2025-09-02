PROGRAMACION FUNCIONAL
A partir de la version 8 de Java se agregaron varias actualizaciones, siendo la implementación del "paradigma de programación funcional" una de ellas.
Basicamente define interfaces que poseen si y solo si un solo método abstracto (sin cuerpo).
Pueden poseer o no la notación @FunctionalInterface, que previene que otro desarrollador agregue más métodos abstractos generando errores en tiempo de compilación.
Adicionalmente, pueden tener métodos por defecto y estáticos sin restricciones.
IMPORTANTE:
Para poder implementar el paradigma funcional se agrega el concepto de lambdas (es un método abstracto que sólo está definido en una interfaz y esta debe ser una interfaz funcional)

JAVA API STREAM
La API Stream es una funcionalidad permite procesar colecciones de datos utilizando un enfoque similar a una "tubería" para transformar elementos en una secuencia. Los streams no almacenan datos sino que proporcionan una vista para aplicar operaciones, permitiendo concentrarse en el "qué" y no en el "cómo" se procesan los datos.
Abarca una gran variedad de conceptos/conceptos como:
- Predicate
- Consumer
- Supplier
- Foreach
- Map
- Filtrer
- Reduce