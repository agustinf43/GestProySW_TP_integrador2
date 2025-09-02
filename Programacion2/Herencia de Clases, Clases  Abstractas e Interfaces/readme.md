
.HERENCIA 
La 'herencia' es una de las grandes cualidades de la POO, que permite que las características pasen de padres a hijos. Cuando una clase hereda de otra, adquiere sus atributos y métodos visibles, permitiendo reutilizar código y funcionalidades, que en las clases que heredan se pueden ampliar o extender. 

.CLASES ABSTRACTAS
Un método definido en una clase, pero cuya implementación se delega en las subclases, se conoce como 'abstracto'.
Las clases abstractas no son instanciables, es decir, no se pueden crear objetos de esa clase; De hecho, estas clases existen especificamente para ser heredadas por otras. Para declarar un método abstracto se le antepone el modificador abstract.

.INTERFACES
Desde el punto de vista sintáctico, una 'interfaz' se parece mucho a una clase: tiene atributos y métodos, pero las interfaces no son instanciables, es decir, no se pueden crear objetos de estas(lo mismo que ocurre con las clases abstractas).Cuando una clase tiene implementada una interfaz concreta (para lo cual se le incluye el modificador implements), se está comprometiendo a tener implementadas en su definición todas las funcionalidades de esa interfaz (tanto metodos como atributos). 
Para ser exactos, se dice que una clase implementa una interfaz cuando implementa sus métodos abstractos. Asi mismo, los métodos por defecto y los estáticos son llamdos de extension. Estos son implementados en la definición de la interfaz (donde también se declaran e inicializan los atributos) y pueden ser sobreescritos en las clases donde se implementan. Tanto unos como otros son incorporados por las clases de forma automática (por defecto).
