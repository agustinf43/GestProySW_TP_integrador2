SPRINGBOOT
Spring facilita la implementación de servicios RESTful al ofrecer componentes y tecnologías, como Spring Boot (herramienta que acelera y facilita el desarrollo de microservicios y aplicaciones web) y Spring Data REST, que simplifican el desarrollo de aplicaciones que se ajustan a los principios de REST

- Principios REST:
•	Cliente-servidor: El cliente envía una solicitud al servidor, y el servidor responde con la información solicitada. 
•	Sin estado: Cada solicitud es independiente de las anteriores; el servidor no mantiene información sobre el cliente entre solicitudes. 
•	Cacheable: Los datos pueden ser almacenados en caché para mejorar el rendimiento. 
•	Interfaz uniforme: Los recursos se identifican mediante URIs y se pueden manipular utilizando metodos HTTP estándar (GET, POST, PUT, DELETE, entre otros)

- Relación entre estos componentes en una aplicación Spring Boot que sigue el patrón de arquitectura en capas, separando responsabilidades:  
•	CONTROLLER: 
Recibe y gestiona las peticiones HTTP del cliente. Llama a la capa de servicio para procesar la lógica de negocio.
•	DTO (Data Transfer Object):
Objeto usado para transferir datos entre capas, especialmente entre el controller y el cliente. Suele contener solo los datos necesarios para desplegar a la vista del usuario.
•	MAPPER: Convierte entre entidades del modelo y DTOs (y viceversa), facilitando la separación entre la lógica interna y la representación externa de los datos.
•	MODEL (ENTIDAD): Representa la estructura de los datos en la base de datos. Suele estar anotada con @Entity.
•	REPOSITORY: Interfaz que gestiona el acceso a la base de datos (CRUD) para las entidades del modelo, usando JPA/Hibernate. Aquí se suelen incluir metodos especificos en lugar de ponerlos en el service.
•	SERVICE: Contiene la lógica de negocio. Llama a los repositorios para acceder a los datos y puede usar mappers para convertir entre modelos y DTOs.
•	IMPLEMENT SERVICE: Implementa la interfaz del servicio, definiendo la lógica concreta de como funcionara la el sitio web.
