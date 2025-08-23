Soy Winkler Guido,estudiante de tecnicatura superior en desarrollo de software.

Enunciado:
Crear un programa que pueda almacenar los productos de una entidad bancaria (CA, CC y TC), con las siguientes condiciones:  
1. Las CA y CC poseen Banco, Sucursal, Número  de Producto.
2. Las Tarjetas de Crédito poseen Banco,  Sucursal, Número de Producto y Clave de Seguridad.
3. El número de producto se genera  automáticamente e incrementa de uno en uno por producto. 
4. El número de producto no se puede pedir por el constructor.
5. Para este desafío, el Banco y la Sucursal son números enteros.

ACTIVIDAD:
En esta actividad lo que se realizó fue la creación de la clase productoBancario con atributos de tipo int:Banco,Sucursal,numProducto y un contador para contar la cantidad de números de productos instanciados.
Despues se crearon las clases cajaAhorro,cuentaCorriente y tarjetaCredito que heredan de productoBancario.
En el main lo que se hizo fue instanciar los objetos de la clase productoBancario,tarjetaCredito,cajaAhorro y cuentaCorriente,después se utilizó una interfaz Set llamada productoBancarioList con la implementación HashSet y se agrego las instancias con el método add.
Por último,se creó la excepción claveSeguridadInválidaException para manejar el error de que si una instancia de tarjetaCredito se crea con una clave que no tiene exactamente 3 digitos,lanza un mensaje que dice:"error al crear la tarjeta".

