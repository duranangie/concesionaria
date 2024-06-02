# CRUD de Concesionaria

Este proyecto implementa un CRUD básico para una concesionaria de vehículos en Java, siguiendo una arquitectura de tres capas: UI, Persistencia y Lógica.

## Requisitos

- Java JDK 8 o superior
- Maven

## Instalación y Ejecución

1. Clona este repositorio:

`git clone https://github.com/tu_usuario/crud-concesionaria.git`


2. Navega al directorio del proyecto:

`cd crud-concesionaria`


3. Compila el proyecto:


`mvn compile`


4. Ejecuta la aplicación:

`mvn exec
-Dexec.mainClass="com.concesionaria.Main"`




## Estructura del Proyecto

El proyecto está organizado en tres capas:

- **UI**: Contiene la interfaz de usuario (consola en este caso) para interactuar con el usuario.
- **Persistencia**: Gestiona la persistencia de los datos en una base de datos (por ejemplo, MySQL, PostgreSQL, etc.). En este ejemplo, se usa una base de datos en memoria para simplificar.
- **Lógica**: Contiene la lógica de negocio de la aplicación.

## Contribución

Si deseas contribuir a este proyecto, por favor, sigue estos pasos:

1. Realiza un fork del repositorio.
2. Crea una nueva rama para tu función: `git checkout -b feature/nueva-funcion`.
3. Realiza tus cambios y haz commit: `git commit -am 'Añade una nueva función'`.
4. Sube tus cambios a la rama: `git push origin feature/nueva-funcion`.
5. Envía un pull request para revisión.

