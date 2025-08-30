En los sistemas pueden ocurrir eventos que corten el ﬂujo correcto y provoquen comportamientos inesperados.
Una 'excepción' es un error que se presenta en  nuestro software. Puede ser más o menos grave.
En Java, no se pueden evitar pero sí gestionar. Así  se evita la interrupción abrupta del sistema,  mediante el tratamiento adecuado del problema.
Este bloque está conformado mediante diferentes partes que capturan los  errores y ejecutan las instrucciones deseadas.

TRY
- Contendrá las instrucciones que pueden  provocar el error. De este tipo de bloque sólo se  puede crear uno por grupo.

CATCH
- Contendrá el código necesario para gestionar el  error. Si se presenta un error en el bloque try el  catch lo capturará creando un objeto según el  tipo de excepción esperada, es por ello que este  bloque contiene un parámetro y se pueden crear  tantos bloques catch crea conveniente.
No es obligatorio tener un catch pero es  recomendable hacerlo.

FINALLY
- Contendrá el código que se ejecutará suceda o  no un error. No es obligatorio, y de ser requerido  sólo puede existir uno al ﬁnal del try, en el caso  de que no posea bloque catch. Si lo posee,  finally debe ubicarse al ﬁnal de todo el grupo.