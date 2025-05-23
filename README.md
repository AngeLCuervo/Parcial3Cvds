#  Clínica ECI Salud Vital - Backend

**Nombre del estudiante**: Angel Cuervo
**Grupo**: CVDS - Tercer Tercio  

##  Tecnologías Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data MongoDB
- Maven
- MongoDB Atlas
- Azure App Service

## 📄 Descripción

Este backend gestiona la lógica de negocio de la aplicación de citas médicas de la Clínica ECI Salud Vital. Permite consultar especialidades, registrar citas con validación de campos, consultar y filtrar historial de citas, y cancelar citas.

### Estructura del Proyecto
src/
├── main/
│ ├── java/
│ │ └── com/eci/clinicavital/
│ │ ├── controller/
│ │ ├── model/
│ │ ├── repository/
│ │ ├── service/
│ │ └── ClinicaVitalApplication.java
│ └── resources/
│ ├── application.properties
│ └── static/
├── test/
│ └── java/com/eci/clinicavital/
│ └── service/


## Pruebas

- Se incluyen pruebas unitarias para los servicios.
- Cobertura mínima del 60%.
- Capturas incluidas abajo.

##  Endpoints

### Lista de Endpoints

####  Especialidades

GET /api/especialidades

##  application.properties

```properties
spring.data.mongodb.uri=mongodb+srv://<mongodb>:<admin>@cluster.mongodb.net/parcial?retryWrites=true&w=majority
server.port=8080
springdoc.api-docs.enabled=true



