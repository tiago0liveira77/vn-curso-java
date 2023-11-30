# Projecto Final -> Vuelos | Hotels | Reservas
Este proyecto es una REST API desarrolada en Spring Boot y ha sido creado como parte de la formación "Master Java"

## Descripción del Proyecto
Este proyecto es una API REST que proporciona servicios para gestionar vuelos, hotels y reservas.
Los vuelos tienen información como id, compañia, fecha de vuelo e plazas.
Los hotels tiene información como id, nombre, categoria y disponibilidad.
Las reservas tiene informacion como id, idHotel, idVuelo y personas.

La API permtie realizar operaciones CRUD a todos los modelos. A crear una reserva es verificado si hay plazas suficientes en el vuelo y si el hotel esta disponible.

Todos los microservicios tiene la dependencia OPENAPI Swagger que permiti visualisar en el browser toda la API e sus endpoints.

## Tecnologias Utilizadas
- Spring Boot
- Java
- RESTful API
- Maven
- Swagger

## Configuración del Proyecto
Documentacion de API (usando las mismas ports):
- Hotels: http://localhost:8080/swagger-ui/index.html
- Vuelos: http://localhost:9000/swagger-ui/index.html
- Reservas http://localhost:9001/swagger-ui/index.html

