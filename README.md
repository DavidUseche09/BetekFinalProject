# Bienvenidos!
# API REST MICROSERVICIO FORMULARIO
Esta aplicación fue diseñada en el marco del proyecto integrador del Bootcamp de backend de Makaia como resultado de la implementación de los conocimientos adquiridos en la formación académica.

## Diagrama de procesos API
Aqui se muestra en la imagen el funcionamiento de procesos que se espera completar del programa

![UML](https://github.com/DavidUseche09/MakaiaFinalProject/blob/davidBranch/Diagramas/Diagrama%20Procesos.png)

## Ejecutando las pruebas ⚙️
_Para ejecutar pruebas se usan las siguientes herramientas_

* [Postman](https://www.postman.com) - Pruebas API
* [jUnit](https://junit.org/junit5/) - El framework para pruebas Unitarias

## Construido con 🛠️

_Las siguientes herramientas fueron implementadas dentro de este módulo:

* [Java](https://www.java.com/es/) - Lenguaje de Programación
* [Spring](https://spring.io/) - El framework web usado
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [MySQL](https://www.mysql.com/) - Motor de Base de datos Relacional


## Autores ✒️

* **Fabian Largo Sierra** - [flsierra](https://github.com/flsierra)
* **David Useche Rosas** - [DavidUseche09](https://github.com/DavidUseche09)
  
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
- Spring Security (Json Web Token)
- JUnit (Testeo de pruebas unitarias)
- Swagger (Documentación de la API)
- Rabbit MQ (Colas para enviar aspirantes y resultados al siguiente modulo)

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
 "entrenamiento": Id,
    "nombre": String,
    "tipo_doc": Id,
    "numero_documento": numero;
    "genero": Id,
    "edad": numero,
    "fecha_nacimiento": Date,
    "celular": numero,
    "email": String,
    "nacionalidad": String,
    "departamento": String,
    "ciudad": String,
    "direccion": String,
    "estrato": Id,
    "grupo_etnico_id": Id,
    "discapacidad_id": Id,
    "poblacion_id_id": Id,
    "nivel_educacion_id": Id,
    "ocupacion_id": Id,
    "ultimo_titulo": String,
    "ocupacion_si": Opcional,
    "salario_actual_id": Id,
    "tiempo_libre": String,
    "persona_emergencia": String,
    "contacto_emergencia": numero,
    "email_emergencia": String,
    "bootcamp_info_id": Id,
    "organizacion": Opcional
}
```
La API devolverá el nuevo cliente creado en formato JSON:
```java
{
 "entrenamiento": 1,
    "nombre": "Fabian",
    "tipo_doc": 1,
    "numero_documento":1234,
    "genero": 2,
    "edad": 24,
    "fecha_nacimiento": "1999-06-09",
    "celular": 321,
    "email": "ex@example.com",
    "nacionalidad": "Colombia",
    "departamento": "Boyacá",
    "ciudad": "Cucaita",
    "direccion":"cll 7",
    "estrato": 1,
    "grupo_etnico_id":1,
    "discapacidad_id":1,
    "poblacion_id_id":6,
    "nivel_educacion_id":5,
    "ocupacion_id":1,
    "ultimo_titulo":"Tec",
    "ocupacion_si":"",
    "salario_actual_id":1,
    "tiempo_libre":"Estudiando",
    "persona_emergencia":"Edisson",
    "contacto_emergencia":311,
    "email_emergencia":"ex@example.com",
    "bootcamp_info_id":3,
    "organizacion":""
}
```
## Endpoint de creación de usuario:
### POST: /api1/v1/user
🙍 **Crear** un nuevo usuario en la base de datos con la información proporcionada en el cuerpo de la solicitud.
Ejemplo de la solicitud:
```java
{
 "email": String,
 "password": String
}
```
La API devolverá el nuevo usuario creado en formato JSON:
```java
{
 "email": "example@gmail.com",
 "password": "1234"
}
```

## Endpoint de creación de test usando API TestGorilla:
### POST: api/v1/testGorilla/invitarCandidato/{assessmentId}
🙍 **Crear** un usuario creado del formulario recibira una invitacion a su correo llenando la informacion requerida:
Ejemplo de la solicitud:
```java
{
 "email": String,
 "first_name": String,
 "last_name": String
}
```
La API devolverá el usuario invitado al test creado en formato JSON:
```java
{
 "email": "example@gmail.com",
 "first_name": "David",
 "last_name": "Rosas"
}
```
### GET: api/v1/testGorilla/pruebas/{assessmentId}/candidatosInvitados
🙍 **Recibir** usuarios invitados segun la prueba y el test usado:
Ejemplo de la solicitud:
```java
{
 "assessmentId": Long
}
```
La API devolverá los usuarios invitados en formato JSON:
```java
{
 "assessmentId": 1
}
```
### GET: api/v1/testGorilla/pruebas/{assessmentId}/resultadosPruebas/{testTakerId}
🙍 **Recibir** resultados de los usuarios segun la prueba y el test usado:
Ejemplo de la solicitud:
```java
{
 "assessmentId": Long,
 "testTaker": Long
}
```
La API devolverá el resultado de la siguiente manera creado en formato JSON:
```java
{
    "test_id": 1,
    "name": "David",
    "score": 100,
    "status": "Published",
    completed: true,
    "custom_questions": "Nothing",
    "algorithm": "big_5",
    is_code_test: false,
    "score_display": "2-1-1-2-1_32.0-34.0-33.0-35.0-32.0"
}
```
