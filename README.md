## RETO BACKEND

Crear un servicio rest tipo POST solo con Spring Boot 2 que reestructure la respuesta de este servicio:

URL: https://reqres.in/api/users

Method: GET

a:

```json
{
  "data": [
    “<id>|<last_name>|<email>”, 
    “<id>|<last_name>|<email>”, 
    “<id>|<last_name>|<email>”, 
    “<id>|<last_name>|<email>”,...
  ]
}
```

La URL debe ser leída desde un archivo externo (properties o yml)


Realizar los test integrados de la capa controller con Spring Test y los test unitarios de la capa service usando junit y Mockito.


Procure utilizar los esencial de Spring, evite en lo posible el uso de librerías adicionales (webflux, lombok, etc.)


Es necesario tener la mayor cobertura de código posible.


Publicar el proyecto en un repositorio GIT, en la rama master debe estar el initializer base de Spring Boot, en la rama develop el desarrollo del reto.


Enviar el enlace del Pull Request desde la rama develop a master.