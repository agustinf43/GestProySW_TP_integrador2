Ejercicio 3 : 
Se desea modelar un sistema que permita almacenar y gestionar los productos bancarios de una entidad financiera.

Los productos pueden ser:
-Caja de Ahorro (CA)
-Cuenta Corriente (CC)
-Tarjeta de Crédito (TC)

Todos los productos tienen en común:
-Banco (número entero)
-Sucursal (número entero)
-Número de producto (único, autogenerado e incremental a partir del 1)

Las Tarjetas de Crédito (TC) además poseen:
-Clave de Seguridad (número de 3 cifras)

El sistema debe cumplir con las siguientes condiciones:
-No se debe permitir que el número de producto se ingrese por constructor.
-El número debe autogenerarse secuencialmente para cada nuevo producto.
-El sistema debe impedir el ingreso de una clave de seguridad inválida (que no tenga exactamente 3 cifras). Si esto ocurre, lanzar una excepción personalizada llamada 'ClaveInvalidaException'.

Implementar un enum TipoProducto con valores: 
-CAJA_AHORRO, CUENTA_CORRIENTE, TARJETA_CREDITO.

Utilizar una colección (List<ProductoBancario>) para almacenar todos los productos creados.

Se debe permitir:
-Agregar un nuevo producto
-Listar todos los productos registrados, mostrando su tipo y datos particulares
