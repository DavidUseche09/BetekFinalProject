# Bienvenidos!
# API REST MICROSERVICIO FORMULARIO
Esta aplicación fue diseñada en el marco del proyecto integrador del Bootcamp de backend de Makaia como resultado de la implementación de los conocimientos adquiridos en la formación académica.

Esta API REST Formulario es una aplicación Spring Boot que permite a los aspirantes interesados en el Bootcamp registrarse llenando campos necesarios de un formulario para postulaciones de formacion tecnologicas.
Para diseñar estas solución se emplearon las siguientes tecnologías:
# Tecnologias implementadas
- Java 21
- Spring Boot :leaves:
- Gestor de dependecias con  Gradle-Groovy  :elephant:
- Motor de base de datos en MySQL :dolphin: y persistencia de datos con JPA.

# Las principales dependencias utilizadas son : 👩‍💻
- Spring Data JPA (Persiste bases de datos SQL utilizando Java Persistence API mediante Spring Data)
- Spring Web (Construye aplicaciones web, incluyendo RESTful, utilizando Spring MVC. Utiliza Apache Tomcat como contenedor integrado predeterminado.)
- Spring Security (Autenticación básica)
- JUnit (Testeo de pruebas unitarias)
- Swagger (Documentación de la API)

## :computer: UML Modelo:
![UML](https://github.com/DavidUseche09/MakaiaFinalProject/blob/main/Diagramas/MakaiaFinalProjectDiagramClass.drawio.png)

## :space_invader: Patrones de diseño:
### DTO (Data Transfer Object):
Se utiliza este patrón para transferencia de datos entre diferentes capas de la aplicación, y para mejorar la seguridad de la aplicación al controlar qué datos se transfieren.

## :computer: Diagrama Entidad Relación:
![MER](https://github.com/DavidUseche09/MakaiaFinalProject/blob/main/Diagramas/MER.png)

## :computer: Endpoints:
## Endpoint de creación de cliente :raising_hand:
### POST: /api/v1/aspirante
🙍 **Crear** un nuevo cliente en la base de datos con la información proporcionada en el cuerpo de la solicitud.

##### Parámetros de entrada:
- Nombre: nombre del aspirante (cadena de texto)
- NumeroDocumento: documento del aspirante (numero)
- Edad: edad del aspirante (numero)
- FechaNacimiento: nacimiento del aspirante (formato de fecha)
- Celular: numero de telefono aspirante (numero)
- Email: correo electronico del aspirante (cadena de texto)
- Nacionalidad: nacionalidad del aspirante (cadena de texto)
- Departamento: departamento de residencia del aspirante (cadena de texto)
- Ciudad: ciudad de residencia del aspirante (cadena de texto)
- Direccion: direccion de residencia del aspirante (cadena de texto)
- UltimoTitulo: ultimo titulo obtenido del aspirante (cadena de texto)
- OcupacionSi: especificar ocupacion en caso de ser afirmativa (cadena de texto)
- TiempoLibre: actividades del aspirante en su tiempo libre (cadena de texto)
- PersonaEmergencia: persona a contactar en caso de emergencia del aspirante (cadena de texto)
- ContactoEmergencia: contacto de emergencia del aspirante (numero)
- EmailEmeergencia: correo electronico de emergencia del aspirante (cadena de texto)
- Organizacion: como se entero del Bootcamp el aspirante (cadena de texto)
  
Ejemplo de la solicitud:
```java 
{
"Nombre": String,
"NumeroDocumento": Long,
}
```
